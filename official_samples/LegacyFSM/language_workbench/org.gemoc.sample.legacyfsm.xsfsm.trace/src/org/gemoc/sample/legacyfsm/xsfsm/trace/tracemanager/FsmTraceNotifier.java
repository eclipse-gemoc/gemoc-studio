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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange;

import org.eclipse.gemoc.trace.gemoc.api.ITraceListener;
import org.eclipse.gemoc.trace.gemoc.api.ITraceNotifier;

public class FsmTraceNotifier implements ITraceNotifier {

	private BatchModelChangeListener traceListener;

	private final List<ITraceListener> listeners = new ArrayList<>();

	public FsmTraceNotifier(BatchModelChangeListener traceListener) {
		this.traceListener = traceListener;
	}

	@Override
	public void notifyListeners() {
		for (ITraceListener listener : listeners) {
			notifyListener(listener);
		}
	}

	@Override
	public void notifyListener(ITraceListener listener) {
		final List<ModelChange> changes = traceListener.getChanges(listener);
		if (!changes.isEmpty()) {
			final List<EObject> startedSteps = new ArrayList<>();
			final List<EObject> endedSteps = new ArrayList<>();
			final List<EObject> newStates = new ArrayList<>();
			final List<EObject> newValues = new ArrayList<>();
			final List<List<? extends EObject>> newDimensions = new ArrayList<>();
			changes.forEach(c -> {
				if (c instanceof NewObjectModelChange) {
					final EObject o = c.getChangedObject();
					if (o instanceof fsmTrace.States.Value) {
						newValues.add((fsmTrace.States.Value) o);
					} else if (o instanceof fsmTrace.Steps.SpecificStep) {
						startedSteps.add((fsmTrace.Steps.SpecificStep) o);
					} else if (o instanceof fsmTrace.States.State) {
						final fsmTrace.States.State newState = (fsmTrace.States.State) o;
						newStates.add(newState);
						endedSteps.addAll(newState.getEndedSteps());
					} else if (o instanceof fsmTrace.States.fsm.TracedStateMachine) {
						newDimensions.add(((fsmTrace.States.fsm.TracedStateMachine) o).getConsummedStringSequence());
						newDimensions.add(((fsmTrace.States.fsm.TracedStateMachine) o).getCurrentStateSequence());
						newDimensions.add(((fsmTrace.States.fsm.TracedStateMachine) o).getProducedStringSequence());
						newDimensions.add(((fsmTrace.States.fsm.TracedStateMachine) o).getUnprocessedStringSequence());
					}
				}
			});
			listener.valuesAdded(newValues);
			listener.dimensionsAdded(newDimensions);
			listener.statesAdded(newStates);
			listener.stepsStarted(startedSteps);
			listener.stepsEnded(endedSteps);
		}
	}

	@Override
	public void addListener(ITraceListener listener) {
		listeners.add(listener);
		traceListener.registerObserver(listener);
	}

	@Override
	public void removeListener(ITraceListener listener) {
		listeners.remove(listener);
		traceListener.removeObserver(listener);
	}
}
