
package org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.trace.tracemanager;

import java.util.List;
import org.eclipse.gemoc.trace.gemoc.api.IStepFactory;

public class FsmTraceStepFactory implements IStepFactory {

	@Override
	public org.eclipse.gemoc.trace.commons.model.trace.Step<?> createStep(
			org.eclipse.gemoc.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		org.eclipse.gemoc.trace.commons.model.trace.Step<?> step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = org.eclipse.gemoc.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("step")
				&& (ec.getClassifierID() == org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getState().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_State_Step();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("initializeModel")
				&& (ec.getClassifierID() == org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getStateMachine().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_StateMachine_InitializeModel();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("fire")
				&& (ec.getClassifierID() == org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
						.getTransition().getClassifierID()))

		{
			step = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_Transition_Fire();
		}

		else {
			step = org.eclipse.gemoc.trace.commons.model.generictrace.GenerictraceFactory.eINSTANCE
					.createGenericSequentialStep();
		}

		org.eclipse.gemoc.trace.commons.model.trace.MSEOccurrence mseocc = org.eclipse.gemoc.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
