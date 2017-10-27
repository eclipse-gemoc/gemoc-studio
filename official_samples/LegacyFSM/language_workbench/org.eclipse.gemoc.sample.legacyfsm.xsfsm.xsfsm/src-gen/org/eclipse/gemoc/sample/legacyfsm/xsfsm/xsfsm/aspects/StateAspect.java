package org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateAspectStateAspectProperties;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspect;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  @Step
  public static void step(final State _self, final String inputString) {
	final org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateAspectStateAspectProperties _self_ = org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_step(_self_, _self, inputString);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "State", "step");
	} else {
		command.execute();
	}
	;
	;
}
  
  protected static void _privk3_step(final StateAspectStateAspectProperties _self_, final State _self, final String inputString) {
    try {
      final Function1<Transition, Boolean> _function = (Transition t) -> {
        return Boolean.valueOf(inputString.startsWith(t.getInput()));
      };
      final Iterable<Transition> validTransitions = IterableExtensions.<Transition>filter(_self.getOutgoingTransitions(), _function);
      boolean _isEmpty = IterableExtensions.isEmpty(validTransitions);
      if (_isEmpty) {
        throw new Exception("No Transition");
      }
      int _size = IterableExtensions.size(validTransitions);
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        throw new Exception("Non Determinism");
      }
      TransitionAspect.fire(((Transition[])Conversions.unwrapArray(validTransitions, Transition.class))[0]);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
