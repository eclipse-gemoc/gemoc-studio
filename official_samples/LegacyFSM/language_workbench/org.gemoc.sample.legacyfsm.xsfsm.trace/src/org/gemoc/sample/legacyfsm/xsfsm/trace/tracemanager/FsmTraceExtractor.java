/*******************************************************************************
 * Copyright (c) 2015, 2017  Inria  and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.gemoc.sample.legacyfsm.xsfsm.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.internal.spec.MatchSpec;
import org.eclipse.emf.compare.postprocessor.BasicPostProcessorDescriptorImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.compare.postprocessor.IPostProcessor.Descriptor.Registry;
import org.eclipse.emf.compare.postprocessor.PostProcessorDescriptorRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import org.eclipse.gemoc.trace.commons.model.trace.LaunchConfiguration;
import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.gemoc.api.ITraceExtractor;
import org.eclipse.gemoc.trace.gemoc.api.ITraceViewListener;

public class FsmTraceExtractor implements ITraceExtractor {

	private fsmTrace.SpecificTrace traceRoot;

	final private List<List<? extends fsmTrace.States.Value>> valueTraces = Collections
			.synchronizedList(new ArrayList<>());

	private List<fsmTrace.States.State> statesTrace;

	final private Map<fsmTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	final private Map<fsmTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	final private DefaultDeclarativeQualifiedNameProvider nameProvider = new DefaultDeclarativeQualifiedNameProvider();

	final private Map<Integer, Boolean> ignoredValueTraces = new HashMap<>();

	private final Map<List<Integer>, List<EObject>> stateEquivalenceClasses = Collections
			.synchronizedMap(new HashMap<>());
	private final Map<List<Integer>, List<EObject>> cachedMaskedStateEquivalenceClasses = Collections
			.synchronizedMap(new HashMap<>());

	private final List<fsmTrace.States.Value> observedValues = new ArrayList<>();

	public FsmTraceExtractor() {
		observedValues.add(null);
		configureDiffEngine();
	}

	private IDiffEngine diffEngine = null;

	private void configureDiffEngine() {
		IDiffProcessor diffProcessor = new DiffBuilder();
		diffEngine = new DefaultDiffEngine(diffProcessor) {
			@Override
			protected FeatureFilter createFeatureFilter() {
				return new FeatureFilter() {
					@Override
					protected boolean isIgnoredReference(Match match, EReference reference) {
						final String name = reference.getName();
						return name.equals("parent") || name.equals("states") || name.equals("statesNoOpposite");
					}
				};
			}
		};
	}

	private List<List<? extends fsmTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends fsmTrace.States.Value>> result = new ArrayList<>();
		for (fsmTrace.States.fsm.TracedStateMachine tracedObject : traceRoot.getFsm_tracedStateMachines()) {
			result.add(tracedObject.getConsummedStringSequence());
			result.add(tracedObject.getCurrentStateSequence());
			result.add(tracedObject.getProducedStringSequence());
			result.add(tracedObject.getUnprocessedStringSequence());
		}
		return result;
	}

	private ValueWrapper getValueWrapper(fsmTrace.States.Value value, int valueIndex) {
		List<fsmTrace.States.State> states = value.getStatesNoOpposite();
		fsmTrace.States.State firstState = states.get(0);
		final int firstStateIndex = statesTrace.indexOf(firstState);
		final int lastStateIndex = (int) (firstStateIndex + states.stream().distinct().count() - 1);
		return new ValueWrapper(value, firstStateIndex, lastStateIndex, valueIndex);
	}

	private fsmTrace.States.Value getValueAt(int traceIndex, int stateIndex) {
		fsmTrace.States.Value result = null;
		if (traceIndex >= 0 && traceIndex < valueTraces.size()) {
			final List<? extends fsmTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final fsmTrace.States.State state = statesTrace.get(stateIndex);
			for (fsmTrace.States.Value value : valueTrace) {
				if (value.getStatesNoOpposite().contains(state)) {
					result = value;
					break;
				}
			}
		}
		return result;
	}

	@Override
	public ValueWrapper getValueWrapper(int traceIndex, int stateIndex) {
		fsmTrace.States.Value value = getValueAt(traceIndex, stateIndex);
		if (value == null) {
			return null;
		}
		List<fsmTrace.States.State> states = value.getStatesNoOpposite();
		fsmTrace.States.State firstState = states.get(0);
		final int firstStateIndex = statesTrace.indexOf(firstState);
		final int lastStateIndex = (int) (firstStateIndex + states.stream().distinct().count() - 1);
		return new ValueWrapper(value, firstStateIndex, lastStateIndex, traceIndex);
	}

	private final IPostProcessor customPostProcessor = new IPostProcessor() {

		private final Function<EObject, String> getIdFunction = e -> e.eClass().getName();

		@Override
		public void postMatch(Comparison comparison, Monitor monitor) {
			final List<Match> matches = new ArrayList<>(comparison.getMatches());
			final List<Match> treatedMatches = new ArrayList<>();
			matches.forEach(m1 -> {
				matches.forEach(m2 -> {
					if (m1 != m2 && !treatedMatches.contains(m2)) {
						final EObject left;
						final EObject right;
						if (m1.getLeft() != null && m1.getRight() == null && m2.getLeft() == null
								&& m2.getRight() != null) {
							left = m1.getLeft();
							right = m2.getRight();
						} else if (m2.getLeft() != null && m2.getRight() == null && m1.getLeft() == null
								&& m1.getRight() != null) {
							left = m2.getLeft();
							right = m1.getRight();
						} else {
							return;
						}
						final String leftId = getIdFunction.apply(left);
						final String rightId = getIdFunction.apply(right);
						if (leftId.equals(rightId)) {
							comparison.getMatches().remove(m1);
							comparison.getMatches().remove(m2);
							final Match match = new MatchSpec();
							match.setLeft(left);
							match.setRight(right);
							comparison.getMatches().add(match);
						}
					}
				});
				treatedMatches.add(m1);
			});
		}

		@Override
		public void postDiff(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postRequirements(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postEquivalences(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postConflicts(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postComparison(Comparison comparison, Monitor monitor) {
		}
	};

	private boolean compareInitialized = false;

	private IPostProcessor.Descriptor descriptor = null;

	private Registry registry = null;

	private EMFCompare compare;

	private boolean compareEObjects(EObject e1, EObject e2) {
		if (e1 == e2) {
			return true;
		}

		if (e1 == null || e2 == null) {
			return false;
		}

		if (!compareInitialized) {
			descriptor = new BasicPostProcessorDescriptorImpl(customPostProcessor, Pattern.compile(".*"), null);
			registry = new PostProcessorDescriptorRegistryImpl();
			registry.put(customPostProcessor.getClass().getName(), descriptor);
			compare = EMFCompare.builder().setPostProcessorRegistry(registry).setDiffEngine(diffEngine).build();
			compareInitialized = true;
		}

		final IComparisonScope scope = new DefaultComparisonScope(e1, e2, null);
		final Comparison comparison = compare.compare(scope);
		return comparison.getDifferences().isEmpty();
	}

	private List<Integer> computeStateComparisonList(List<fsmTrace.States.Value> values) {
		final List<Integer> valueIndexes = new ArrayList<>();
		for (int i = 0; i < values.size(); i++) {
			final fsmTrace.States.Value value = values.get(i);
			int idx = -1;
			for (int j = 0; j < observedValues.size(); j++) {
				final EObject v1 = observedValues.get(j);
				final EObject v2 = value;
				if (compareEObjects(v1, v2)) {
					idx = j;
					break;
				}
			}
			if (idx != -1) {
				valueIndexes.add(idx);
			} else {
				valueIndexes.add(observedValues.size());
				observedValues.add(value);
			}
		}
		return valueIndexes;
	}

	private void updateEquivalenceClasses(fsmTrace.States.State state) {
		final List<fsmTrace.States.Value> values = getAllStateValues(state, true);
		final List<Integer> valueIndexes = computeStateComparisonList(values);
		List<EObject> equivalenceClass = stateEquivalenceClasses.get(valueIndexes);
		if (equivalenceClass == null) {
			equivalenceClass = new ArrayList<>();
			stateEquivalenceClasses.put(valueIndexes, equivalenceClass);
		}
		equivalenceClass.add(state);
		// If the cached masked equivalence classes have not been flushed, updated them.
		final List<Integer> dimensionsToMask = computeDimensionMask();
		if (!(dimensionsToMask.isEmpty() || cachedMaskedStateEquivalenceClasses.isEmpty())) {
			final List<Integer> maskedIndexList = applyMask(valueIndexes, dimensionsToMask);
			equivalenceClass = cachedMaskedStateEquivalenceClasses.get(maskedIndexList);
			if (equivalenceClass == null) {
				equivalenceClass = new ArrayList<>();
				cachedMaskedStateEquivalenceClasses.put(maskedIndexList, equivalenceClass);
			}
			equivalenceClass.add(state);
		}
	}

	private void updateEquivalenceClasses(List<fsmTrace.States.State> states) {
		states.stream().distinct().forEach(s -> updateEquivalenceClasses(s));
	}

	/*
	 * Return the list of indexes of value traces that are ignored.
	 */
	private List<Integer> computeDimensionMask() {
		final List<Integer> result = new ArrayList<>();
		for (int i = 0; i < valueTraces.size(); i++) {
			if (isValueTraceIgnored(i)) {
				result.add(i);
			}
		}
		return result;
	}

	private List<Integer> applyMask(List<Integer> source, List<Integer> mask) {
		final List<Integer> result = new ArrayList<>(source);
		int j = 0;
		for (Integer i : mask) {
			result.remove(i - j);
			j++;
		}
		return result;
	}

	private List<List<EObject>> getStateEquivalenceClasses() {
		final List<Integer> dimensionsToMask = computeDimensionMask();
		if (dimensionsToMask.isEmpty()) {
			return new ArrayList<>(stateEquivalenceClasses.values());
		}
		if (cachedMaskedStateEquivalenceClasses.isEmpty()) {
			stateEquivalenceClasses.forEach((indexList, stateList) -> {
				final List<Integer> maskedIndexList = applyMask(indexList, dimensionsToMask);
				List<EObject> equivalenceClass = cachedMaskedStateEquivalenceClasses.get(maskedIndexList);
				if (equivalenceClass == null) {
					equivalenceClass = new ArrayList<>();
					cachedMaskedStateEquivalenceClasses.put(maskedIndexList, equivalenceClass);
				}
				equivalenceClass.addAll(stateList);
			});
		}
		return new ArrayList<>(cachedMaskedStateEquivalenceClasses.values());
	}

	@Override
	public List<List<EObject>> computeStateEquivalenceClasses() {
		return getStateEquivalenceClasses().stream().map(l -> new ArrayList<>(l)).collect(Collectors.toList());
	}

	@Override
	public List<List<EObject>> computeStateEquivalenceClasses(List<? extends EObject> states) {
		return getStateEquivalenceClasses().stream()
				.map(l -> l.stream().filter(s -> states.contains(s)).collect(Collectors.toList()))
				.collect(Collectors.toList());
	}

	@Override
	public boolean compareStates(EObject eObject1, EObject eObject2, boolean respectIgnored) {
		final fsmTrace.States.State state1;
		final fsmTrace.States.State state2;

		if (eObject1 instanceof fsmTrace.States.State) {
			state1 = (fsmTrace.States.State) eObject1;
		} else {
			return false;
		}

		if (eObject2 instanceof fsmTrace.States.State) {
			state2 = (fsmTrace.States.State) eObject2;
		} else {
			return false;
		}

		final List<fsmTrace.States.Value> values1 = getAllStateValues(state1);
		final List<fsmTrace.States.Value> values2 = getAllStateValues(state2);

		if (values1.size() != values2.size()) {
			return false;
		}

		boolean result = true;
		for (int i = 0; i < values1.size(); i++) {
			if (!respectIgnored || !isValueTraceIgnored(i)) {
				final fsmTrace.States.Value value1 = values1.get(i);
				final fsmTrace.States.Value value2 = values2.get(i);
				if (value1 != value2) {
					result = result && compareEObjects(value1, value2);
					if (!result) {
						break;
					}
				}
			}
		}

		return result;
	}

	public boolean compareSteps(EObject eObject1, EObject eObject2) {
		final fsmTrace.Steps.SpecificStep step1;
		final fsmTrace.Steps.SpecificStep step2;

		if (eObject1 instanceof fsmTrace.Steps.SpecificStep) {
			step1 = (fsmTrace.Steps.SpecificStep) eObject1;
		} else {
			return false;
		}

		if (eObject2 instanceof fsmTrace.Steps.SpecificStep) {
			step2 = (fsmTrace.Steps.SpecificStep) eObject2;
		} else {
			return false;
		}

		if (step1.eClass() == step2.eClass()) {
			return true;
		}

		return false;
	}

	public boolean compareStatesWithSteps(EObject eObject1, EObject eObject2, boolean respectIgnored) {
		final fsmTrace.States.State state1;
		final fsmTrace.States.State state2;

		if (eObject1 instanceof fsmTrace.States.State) {
			state1 = (fsmTrace.States.State) eObject1;
		} else {
			return false;
		}

		if (eObject2 instanceof fsmTrace.States.State) {
			state2 = (fsmTrace.States.State) eObject2;
		} else {
			return false;
		}

		if (compareStates(state1, state2, respectIgnored)) {
			final List<fsmTrace.Steps.SpecificStep> endedSteps1 = state1.getEndedSteps();
			final List<fsmTrace.Steps.SpecificStep> startedSteps1 = state1.getStartedSteps();
			final List<fsmTrace.Steps.SpecificStep> endedSteps2 = state2.getEndedSteps();
			final List<fsmTrace.Steps.SpecificStep> startedSteps2 = state2.getStartedSteps();
			if (endedSteps1.size() == endedSteps2.size() && startedSteps1.size() == startedSteps2.size()) {
				boolean result = true;
				for (int i = 0; i < endedSteps1.size(); i++) {
					final fsmTrace.Steps.SpecificStep endedStep1 = endedSteps1.get(i);
					final fsmTrace.Steps.SpecificStep endedStep2 = endedSteps2.get(i);
					if (!compareSteps(endedStep1, endedStep2)) {
						result = false;
						break;
					}
				}
				if (!result) {
					return false;
				}
				for (int i = 0; i < startedSteps1.size(); i++) {
					final fsmTrace.Steps.SpecificStep startedStep1 = startedSteps1.get(i);
					final fsmTrace.Steps.SpecificStep startedStep2 = startedSteps2.get(i);
					if (!compareSteps(startedStep1, startedStep2)) {
						result = false;
						break;
					}
				}
				return result;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean compareTraces(EObject eObject1, EObject eObject2, boolean respectIgnored) {
		final fsmTrace.SpecificTrace trace1;
		final fsmTrace.SpecificTrace trace2;

		if (eObject1 instanceof fsmTrace.SpecificTrace) {
			trace1 = (fsmTrace.SpecificTrace) eObject1;
		} else {
			return false;
		}

		if (eObject2 instanceof fsmTrace.SpecificTrace) {
			trace2 = (fsmTrace.SpecificTrace) eObject2;
		} else {
			return false;
		}

		final List<fsmTrace.States.State> states1 = trace1.getStatesTrace();
		final List<fsmTrace.States.State> states2 = trace2.getStatesTrace();

		if (states1.size() != states2.size()) {
			return false;
		}

		boolean result = true;

		for (int i = 0; i < states1.size(); i++) {
			final fsmTrace.States.State state1 = states1.get(i);
			final fsmTrace.States.State state2 = states2.get(i);
			if (!compareStatesWithSteps(state1, state2, respectIgnored)) {
				result = false;
				break;
			}
		}

		return result;
	}

	private List<fsmTrace.States.Value> getAllStateValues(fsmTrace.States.State state) {
		return getAllStateValues(state, false);
	}

	private List<fsmTrace.States.Value> getAllStateValues(fsmTrace.States.State state, boolean includeHiddenValues) {
		final List<fsmTrace.States.Value> result = new ArrayList<>();
		for (int i = 0; i < valueTraces.size(); i++) {
			if (includeHiddenValues || !isValueTraceIgnored(i)) {
				final List<? extends fsmTrace.States.Value> trace = valueTraces.get(i);
				boolean notFound = true;
				for (fsmTrace.States.Value value : trace) {
					if (value.getStatesNoOpposite().contains(state)) {
						result.add(value);
						notFound = false;
						break;
					}
				}
				if (notFound) {
					result.add(null);
				}
			}
		}
		return result;
	}

	private int getStartingIndex(fsmTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(fsmTrace.Steps.SpecificStep step) {
		if (step.getEndingState() != null) {
			return stepToEndingIndex.computeIfAbsent(step, s -> {
				return statesTrace.indexOf(s.getEndingState());
			});
		}
		return -1;
	}

	public void loadTrace(fsmTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		valueTraces.addAll(getAllValueTraces());
		updateEquivalenceClasses(statesTrace);
	}

	@Override
	public List<StepWrapper> getStepWrappers(int startingState, int endingState) {
		Predicate<fsmTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).map(s -> getStepWrapper(s))
				.collect(Collectors.toList());
	}

	private boolean isStateBreakable(fsmTrace.States.State state) {
		final boolean b = state.getStartedSteps().size() == 1;
		if (b) {
			fsmTrace.Steps.SpecificStep s = state.getStartedSteps().get(0);
			return !(s instanceof fsmTrace.Steps.Fsm_State_Step_ImplicitStep);
		}
		return true;
	}

	@Override
	public StateWrapper getStateWrapper(int stateIndex) {
		if (stateIndex > -1 && stateIndex < statesTrace.size()) {
			final fsmTrace.States.State state = statesTrace.get(stateIndex);
			return new StateWrapper(state, stateIndex, isStateBreakable(state), getStateDescription(stateIndex));
		}
		return null;
	}

	@Override
	public StateWrapper getStateWrapper(EObject state) {
		if (state instanceof fsmTrace.States.State) {
			final int idx = statesTrace.indexOf(state);
			if (idx != -1) {
				final fsmTrace.States.State state_cast = (fsmTrace.States.State) state;
				return new StateWrapper(state_cast, idx, isStateBreakable(state_cast), getStateDescription(idx));
			}
		}
		return null;
	}

	@Override
	public List<StateWrapper> getStateWrappers(int start, int end) {
		final List<StateWrapper> result = new ArrayList<>();
		final int startStateIndex = Math.max(0, start);
		final int endStateIndex = Math.min(statesTrace.size() - 1, end);

		for (int i = startStateIndex; i < endStateIndex + 1; i++) {
			final fsmTrace.States.State state = statesTrace.get(i);
			result.add(new StateWrapper(state, i, isStateBreakable(state), getStateDescription(i)));
		}

		return result;
	}

	@Override
	public List<ValueWrapper> getValueWrappers(int valueTraceIndex, int start, int end) {
		final List<ValueWrapper> result = new ArrayList<>();

		if (valueTraceIndex < valueTraces.size()) {
			final List<? extends fsmTrace.States.Value> valueTrace = valueTraces.get(valueTraceIndex);
			for (fsmTrace.States.Value value : valueTrace) {
				final int currentValueIndex = valueTrace.indexOf(value);
				ValueWrapper wrapper = getValueWrapper(value, currentValueIndex);
				if (wrapper.firstStateIndex < end && wrapper.lastStateIndex > start) {
					result.add(wrapper);
				}
			}
		}

		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public StepWrapper getStepWrapper(Step step) {
		if (step instanceof fsmTrace.Steps.SpecificStep) {
			final fsmTrace.Steps.SpecificStep step_cast = (fsmTrace.Steps.SpecificStep) step;
			final int startingIndex = getStartingIndex(step_cast);
			final int endingIndex = getEndingIndex(step_cast);
			final List<Step> subSteps = new ArrayList<>();
			if (step_cast instanceof SequentialStep<?>) {
				subSteps.addAll(((SequentialStep<fsmTrace.Steps.SpecificStep>) step_cast).getSubSteps());
			}
			return new StepWrapper(step, startingIndex, endingIndex, subSteps);
		}
		return null;
	}

	@Override
	public int getNumberOfTraces() {
		return valueTraces.size();
	}

	@Override
	public int getStatesTraceLength() {
		return statesTrace.size();
	}

	@Override
	public int getValuesTraceLength(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			List<? extends fsmTrace.States.Value> trace = valueTraces.get(traceIndex);
			return trace.size();
		}
		return -1;
	}

	private String getValueName(EObject value) {
		final EObject container = value.eContainer();
		final List<String> attributes = container.eClass().getEAllReferences().stream()
				.filter(r -> r.getName().endsWith("Sequence"))
				.map(r -> r.getName().substring(0, r.getName().length() - 8)).collect(Collectors.toList());
		if (attributes.isEmpty()) {
			return "";
		} else {
			return attributes.stream().filter(s -> value.getClass().getName().contains("_" + s + "_")).findFirst()
					.orElse("");
		}
	}

	private Object getOriginalObject(EObject eObject) {
		return eObject.eClass().getEAllReferences().stream().filter(r -> r.getName().startsWith("originalObject"))
				.findFirst().map(r -> eObject.eGet(r)).orElse(null);
	}

	private String getObjectDescription(Object object) {
		if (object == null) {
			return "null";
		}
		if (object instanceof EObject) {
			final Object originalObject = getOriginalObject((EObject) object);
			if (originalObject != null) {
				if (originalObject instanceof EObject) {
					final QualifiedName qname = nameProvider.getFullyQualifiedName((EObject) originalObject);
					if (qname != null) {
						return qname.getLastSegment();
					}
				}
				return originalObject.toString();
			}
			QualifiedName qname = nameProvider.getFullyQualifiedName((EObject) object);
			if (qname != null) {
				return qname.getLastSegment();
			}
		}
		if (object instanceof Collection) {
			@SuppressWarnings("unchecked")
			final Collection<Object> o_cast = (Collection<Object>) object;
			if (!o_cast.isEmpty()) {
				List<String> strings = o_cast.stream().map(o -> getObjectDescription(o)).collect(Collectors.toList());
				return strings.toString();
			}
		}
		return object.toString();
	}

	@Override
	public String getValueLabel(int traceIndex) {
		String attributeName = "";
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends fsmTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			if (valueTrace.isEmpty()) {
				return "";
			}
			if (valueTrace instanceof EcoreEList) {
				final EcoreEList<?> eList = (EcoreEList<?>) valueTrace;
				final EObject owner = eList.getEObject();
				final List<String> attributes = owner.eClass().getEAllReferences().stream()
						.filter(r -> r.getName().endsWith("Sequence"))
						.map(r -> r.getName().substring(0, r.getName().length() - 8)).collect(Collectors.toList());
				final Object originalObject = getOriginalObject(owner);
				if (!attributes.isEmpty()) {
					String n = eList.data().getClass().getComponentType().getName();
					attributeName = attributes.stream().filter(s -> n.contains("_" + s + "_")).findFirst().orElse("");
				}
				if (originalObject != null) {
					if (originalObject instanceof EObject) {
						final EObject eObject = (EObject) originalObject;
						if (eObject.eIsProxy()) {
							final String proxyToString = eObject.toString();
							final int idx = proxyToString.indexOf("eProxyURI: ") + 11;
							final String s = proxyToString.substring(idx, proxyToString.length() - 1);
							return attributeName + " (" + s + ")";
						}
						final QualifiedName qname = nameProvider.getFullyQualifiedName(eObject);
						if (qname != null) {
							return attributeName + " (" + qname.toString() + " :" + eObject.eClass().getName() + ")";
						}
					}
					return attributeName + " (" + originalObject.toString() + ")";
				}
			}
		}
		return attributeName;
	}

	@Override
	public String getStateDescription(int stateIndex) {
		String result = "";
		for (int i = 0; i < valueTraces.size(); i++) {
			if (!isValueTraceIgnored(i)) {
				String description = getValueDescription(i, stateIndex);
				result += (description == null ? "" : (result.length() == 0 ? "" : "\n") + description);
			}
		}
		return result;
	}

	@Override
	public String getValueDescription(int traceIndex, int stateIndex) {
		final EObject value = getValueAt(traceIndex, stateIndex);
		if (value == null) {
			return null;
		}
		String description = getValueLabel(traceIndex) + " : ";
		final String attributeName = getValueName(value);
		if (attributeName.length() > 0) {
			final Optional<EStructuralFeature> attribute = value.eClass().getEAllStructuralFeatures().stream()
					.filter(r -> r.getName().equals(attributeName)).findFirst();
			if (attribute.isPresent()) {
				final Object o = value.eGet(attribute.get());
				return description + getObjectDescription(o);
			}
		}
		return description + value;
	}

	@Override
	public LaunchConfiguration getLaunchConfiguration() {
		return traceRoot.getLaunchconfiguration();
	}

	@Override
	public void ignoreValueTrace(int trace, boolean ignore) {
		if (trace > -1 && trace < valueTraces.size()) {
			ignoredValueTraces.put(trace, ignore);
			cachedMaskedStateEquivalenceClasses.clear();
			notifyListeners();
		}
	}

	@Override
	public boolean isValueTraceIgnored(int trace) {
		Boolean result = null;
		if (trace > -1 && trace < valueTraces.size()) {
			result = ignoredValueTraces.get(trace);
		}
		return result != null && result;
	}

	@Override
	public void statesAdded(List<EObject> states) {
		updateEquivalenceClasses(states.stream().map(e -> (fsmTrace.States.State) e).collect(Collectors.toList()));
		notifyListeners();
	}

	private Map<EObject, Map<EReference, List<EObject>>> valuesTracesMap = new HashMap<>();

	private Map<ITraceViewListener, Set<TraceViewCommand>> listeners = new HashMap<>();

	@Override
	public void valuesAdded(List<EObject> values) {
		// Nothing to do here.
	}

	@Override
	public void dimensionsAdded(List<List<? extends EObject>> dimensions) {
		if (!dimensions.isEmpty()) {
			valueTraces.clear();
			cachedMaskedStateEquivalenceClasses.clear();
			valueTraces.addAll(getAllValueTraces());
			final List<Integer> insertedTracesIndexes = new ArrayList<>();
			for (List<? extends EObject> valueTrace : dimensions) {
				final int i = valueTraces.indexOf(valueTrace);
				insertedTracesIndexes.add(i);
			}
			Collections.sort(insertedTracesIndexes);
			final List<List<Integer>> keys = new ArrayList<>(stateEquivalenceClasses.keySet());
			for (List<Integer> key : keys) {
				List<EObject> states = stateEquivalenceClasses.remove(key);
				for (Integer i : insertedTracesIndexes) {
					key.add(i, -1);
				}
				stateEquivalenceClasses.put(key, states);
			}
			List<Integer> ignoredTracesIndexes = new ArrayList<>(ignoredValueTraces.keySet());
			Collections.sort(ignoredTracesIndexes);
			while (!ignoredTracesIndexes.isEmpty()) {
				int i = ignoredTracesIndexes.remove(0);
				if (insertedTracesIndexes.get(0) <= i) {
					for (int j = ignoredTracesIndexes.size() - 1; j >= 0; j--) {
						final Integer idx = ignoredTracesIndexes.get(j);
						ignoredValueTraces.put(idx + 1, ignoredValueTraces.remove(idx));
					}
					ignoredTracesIndexes = ignoredTracesIndexes.stream().map(idx -> idx + 1)
							.collect(Collectors.toList());
					ignoredValueTraces.put(i + 1, ignoredValueTraces.remove(i));
					insertedTracesIndexes.remove(0);
				}
			}
		}
	}

	@Override
	public void notifyListeners() {
		for (Map.Entry<ITraceViewListener, Set<TraceViewCommand>> entry : listeners.entrySet()) {
			entry.getValue().forEach(c -> c.execute());
		}
	}

	@Override
	public void registerCommand(ITraceViewListener listener, TraceViewCommand command) {
		if (listener != null) {
			Set<TraceViewCommand> commands = listeners.get(listener);
			if (commands == null) {
				commands = new HashSet<>();
				listeners.put(listener, commands);
			}
			commands.add(command);
		}
	}

	@Override
	public void removeListener(ITraceViewListener listener) {
		if (listener != null) {
			listeners.remove(listener);
		}
	}

	@Override
	public void stepsStarted(List<EObject> steps) {
		// Nothing to do here.
	}

	@Override
	public void stepsEnded(List<EObject> steps) {
		// Nothing to do here.
	}
}
