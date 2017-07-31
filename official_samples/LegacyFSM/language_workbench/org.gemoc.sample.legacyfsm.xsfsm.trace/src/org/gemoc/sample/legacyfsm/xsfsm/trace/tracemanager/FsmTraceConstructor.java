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

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gemoc.trace.commons.model.launchconfiguration.LaunchConfiguration;
import org.eclipse.gemoc.trace.commons.model.trace.MSEModel;
import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject;
import org.eclipse.gemoc.trace.gemoc.api.ITraceConstructor;

public class FsmTraceConstructor implements ITraceConstructor {
	private fsmTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, TracedObject<?>> exeToTraced;

	private fsmTrace.States.SpecificState lastState;

	private Resource traceResource;
	private final Deque<fsmTrace.Steps.SpecificStep> context = new LinkedList<fsmTrace.Steps.SpecificStep>();

	public FsmTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, TracedObject<?>> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = fsmTrace.States.StatesFactory.eINSTANCE.createSpecificState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement) {
						org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement o_cast = (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStates().add(lastState);
		}
	}

	private boolean addNewObjectToState(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement o_cast,
			fsmTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) {
			added = addNewObjectToState((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) {
			added = addNewObjectToState((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition) {
			added = addNewObjectToState((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State o_cast,
			fsmTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fsmTrace.States.fsm.TracedState tracedObject = fsmTrace.States.fsm.FsmFactory.eINSTANCE.createTracedState();
			tracedObject.setOriginalObject((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine o_cast,
			fsmTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fsmTrace.States.fsm.TracedStateMachine tracedObject = fsmTrace.States.fsm.FsmFactory.eINSTANCE
					.createTracedStateMachine();
			tracedObject.setOriginalObject((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field consummedString
			tracedObject.setStateMachine_consummedString_Dimension(
					fsmTrace.States.StatesFactory.eINSTANCE.createStateMachine_consummedString_Dimension());
			// Creation of the first value of the field consummedString
			fsmTrace.States.StateMachine_consummedString_Value firstValue_consummedString = fsmTrace.States.StatesFactory.eINSTANCE
					.createStateMachine_consummedString_Value();

			firstValue_consummedString.setConsummedString((java.lang.String) o_cast.getConsummedString());
			tracedObject.getStateMachine_consummedString_Dimension().getValues().add(firstValue_consummedString);
			newState.getValues().add(firstValue_consummedString);

			// Creation of the dimension corresponding to the field currentState
			tracedObject.setStateMachine_currentState_Dimension(
					fsmTrace.States.StatesFactory.eINSTANCE.createStateMachine_currentState_Dimension());
			// Creation of the first value of the field currentState
			fsmTrace.States.StateMachine_currentState_Value firstValue_currentState = fsmTrace.States.StatesFactory.eINSTANCE
					.createStateMachine_currentState_Value();

			if (o_cast.getCurrentState() != null) {
				addNewObjectToState((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) o_cast.getCurrentState(),
						newState);
				firstValue_currentState.setCurrentState(
						(fsmTrace.States.fsm.TracedState) ((fsmTrace.States.fsm.TracedState) exeToTraced
								.get(o_cast.getCurrentState())));
			} else {
				firstValue_currentState.setCurrentState((fsmTrace.States.fsm.TracedState) null);
			}

			tracedObject.getStateMachine_currentState_Dimension().getValues().add(firstValue_currentState);
			newState.getValues().add(firstValue_currentState);

			// Creation of the dimension corresponding to the field producedString
			tracedObject.setStateMachine_producedString_Dimension(
					fsmTrace.States.StatesFactory.eINSTANCE.createStateMachine_producedString_Dimension());
			// Creation of the first value of the field producedString
			fsmTrace.States.StateMachine_producedString_Value firstValue_producedString = fsmTrace.States.StatesFactory.eINSTANCE
					.createStateMachine_producedString_Value();

			firstValue_producedString.setProducedString((java.lang.String) o_cast.getProducedString());
			tracedObject.getStateMachine_producedString_Dimension().getValues().add(firstValue_producedString);
			newState.getValues().add(firstValue_producedString);

			// Creation of the dimension corresponding to the field unprocessedString
			tracedObject.setStateMachine_unprocessedString_Dimension(
					fsmTrace.States.StatesFactory.eINSTANCE.createStateMachine_unprocessedString_Dimension());
			// Creation of the first value of the field unprocessedString
			fsmTrace.States.StateMachine_unprocessedString_Value firstValue_unprocessedString = fsmTrace.States.StatesFactory.eINSTANCE
					.createStateMachine_unprocessedString_Value();

			firstValue_unprocessedString.setUnprocessedString((java.lang.String) o_cast.getUnprocessedString());
			tracedObject.getStateMachine_unprocessedString_Dimension().getValues().add(firstValue_unprocessedString);
			newState.getValues().add(firstValue_unprocessedString);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition o_cast,
			fsmTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fsmTrace.States.fsm.TracedTransition tracedObject = fsmTrace.States.fsm.FsmFactory.eINSTANCE
					.createTracedTransition();
			tracedObject.setOriginalObject((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private fsmTrace.States.SpecificState copyState(fsmTrace.States.SpecificState oldState) {
		fsmTrace.States.SpecificState newState = fsmTrace.States.StatesFactory.eINSTANCE.createSpecificState();
		newState.getValues().addAll(oldState.getValues());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		} else if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			fsmTrace.States.SpecificState newState = copyState(lastState);
			for (org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) {
						org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine o_cast = (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) o;

						if (p.getFeatureID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getStateMachine_CurrentState().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							fsmTrace.States.fsm.TracedStateMachine traced = (fsmTrace.States.fsm.TracedStateMachine) exeToTraced
									.get(o);
							fsmTrace.States.StateMachine_currentState_Value lastValue = traced
									.getStateMachine_currentState_Dimension().getValues()
									.get(traced.getStateMachine_currentState_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							fsmTrace.States.StateMachine_currentState_Value newValue = fsmTrace.States.StatesFactory.eINSTANCE
									.createStateMachine_currentState_Value();

							fsmTrace.States.fsm.TracedState value = null;
							if (o_cast.getCurrentState() != null) {
								addNewObjectToState(o_cast.getCurrentState(), newState);
								value = ((fsmTrace.States.fsm.TracedState) exeToTraced.get(o_cast.getCurrentState()));
							}

							newValue.setCurrentState((fsmTrace.States.fsm.TracedState) value);

							traced.getStateMachine_currentState_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getStateMachine_UnprocessedString().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							fsmTrace.States.fsm.TracedStateMachine traced = (fsmTrace.States.fsm.TracedStateMachine) exeToTraced
									.get(o);
							fsmTrace.States.StateMachine_unprocessedString_Value lastValue = traced
									.getStateMachine_unprocessedString_Dimension().getValues()
									.get(traced.getStateMachine_unprocessedString_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							fsmTrace.States.StateMachine_unprocessedString_Value newValue = fsmTrace.States.StatesFactory.eINSTANCE
									.createStateMachine_unprocessedString_Value();

							java.lang.String value = o_cast.getUnprocessedString();

							newValue.setUnprocessedString((java.lang.String) value);

							traced.getStateMachine_unprocessedString_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getStateMachine_ConsummedString().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							fsmTrace.States.fsm.TracedStateMachine traced = (fsmTrace.States.fsm.TracedStateMachine) exeToTraced
									.get(o);
							fsmTrace.States.StateMachine_consummedString_Value lastValue = traced
									.getStateMachine_consummedString_Dimension().getValues()
									.get(traced.getStateMachine_consummedString_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							fsmTrace.States.StateMachine_consummedString_Value newValue = fsmTrace.States.StatesFactory.eINSTANCE
									.createStateMachine_consummedString_Value();

							java.lang.String value = o_cast.getConsummedString();

							newValue.setConsummedString((java.lang.String) value);

							traced.getStateMachine_consummedString_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getStateMachine_ProducedString().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							fsmTrace.States.fsm.TracedStateMachine traced = (fsmTrace.States.fsm.TracedStateMachine) exeToTraced
									.get(o);
							fsmTrace.States.StateMachine_producedString_Value lastValue = traced
									.getStateMachine_producedString_Dimension().getValues()
									.get(traced.getStateMachine_producedString_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							fsmTrace.States.StateMachine_producedString_Value newValue = fsmTrace.States.StatesFactory.eINSTANCE
									.createStateMachine_producedString_Value();

							java.lang.String value = o_cast.getProducedString();

							newValue.setProducedString((java.lang.String) value);

							traced.getStateMachine_producedString_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}
				}
			}
			if (stateChanged) {
				final fsmTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof org.eclipse.gemoc.trace.commons.model.trace.BigStep) {
					final fsmTrace.States.SpecificState startingState = lastState;
					final fsmTrace.States.SpecificState endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStates().add(lastState);
			} else if (copiedState) {
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(org.eclipse.gemoc.trace.commons.model.trace.Step<?> step) {
		fsmTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof fsmTrace.Steps.SpecificStep) {
			step_cast = (fsmTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = org.eclipse.gemoc.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			fsmTrace.States.SpecificState state = traceRoot.getStates().get(traceRoot.getStates().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<fsmTrace.Steps.SpecificStep, fsmTrace.States.SpecificState>) context.getFirst())
						.getSubSteps().add(step_cast);
			} else {
				((SequentialStep<fsmTrace.Steps.SpecificStep, fsmTrace.States.SpecificState>) traceRoot.getRootStep())
						.getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof fsmTrace.Steps.Fsm_State_Step) {
				fsmTrace.Steps.Fsm_State_Step fsm_State_StepInstance = (fsmTrace.Steps.Fsm_State_Step) step_cast;
				traceRoot.getFsm_State_Step_Sequence().add(fsm_State_StepInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_StateMachine_InitializeModel) {
				fsmTrace.Steps.Fsm_StateMachine_InitializeModel fsm_StateMachine_InitializeModelInstance = (fsmTrace.Steps.Fsm_StateMachine_InitializeModel) step_cast;
				traceRoot.getFsm_StateMachine_InitializeModel_Sequence().add(fsm_StateMachine_InitializeModelInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_Transition_Fire) {
				fsmTrace.Steps.Fsm_Transition_Fire fsm_Transition_FireInstance = (fsmTrace.Steps.Fsm_Transition_Fire) step_cast;
				traceRoot.getFsm_Transition_Fire_Sequence().add(fsm_Transition_FireInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(fsmTrace.Steps.SpecificStep currentStep, fsmTrace.States.SpecificState startingState,
			fsmTrace.States.SpecificState endingState) {

		fsmTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof fsmTrace.Steps.Fsm_State_Step) {
			implicitStep = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_State_Step_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<fsmTrace.Steps.SpecificStep, fsmTrace.States.SpecificState>) currentStep).getSubSteps()
					.add(implicitStep);

		}
	}

	@Override
	public void endStep(org.eclipse.gemoc.trace.commons.model.trace.Step<?> step) {
		fsmTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = fsmTrace.FsmTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		org.eclipse.gemoc.trace.commons.model.trace.SequentialStep<fsmTrace.Steps.SpecificStep, fsmTrace.States.SpecificState> rootStep = fsmTrace.Steps.StepsFactory.eINSTANCE
				.createSpecificRootStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.eclipse.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		allResources.removeIf(
				r -> r == null || (r != executedModel && executedModel.getContents().contains(r.getContents().get(0))));
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
