package org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspect;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspectTransitionAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void fire(final Transition _self) {
	final org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspectTransitionAspectProperties _self_ = org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_fire(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transition", "fire");
	} else {
		command.execute();
	}
	;
	;
}
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    String _name = _self.getName();
    String _plus = ("Firing " + _name);
    String _plus_1 = (_plus + " and entering ");
    String _name_1 = _self.getTarget().getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    final StateMachine fsm = _self.getSource().getOwningFSM();
    StateMachineAspect.currentState(fsm, _self.getTarget());
    String _producedString = StateMachineAspect.producedString(fsm);
    String _output = _self.getOutput();
    String _plus_3 = (_producedString + _output);
    StateMachineAspect.producedString(fsm, _plus_3);
    String _consummedString = StateMachineAspect.consummedString(fsm);
    String _input = _self.getInput();
    String _plus_4 = (_consummedString + _input);
    StateMachineAspect.consummedString(fsm, _plus_4);
    StateMachineAspect.unprocessedString(fsm, StateMachineAspect.unprocessedString(fsm).substring(_self.getInput().length()));
  }
}
