package org.gemoc.sample.legacyfsm.fsm.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step

import org.gemoc.sample.legacyfsm.fsm.State
import org.gemoc.sample.legacyfsm.fsm.StateMachine
import org.gemoc.sample.legacyfsm.fsm.Transition

import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.StateAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.TransitionAspect.*
import org.eclipse.emf.common.util.EList

@Aspect(className=StateMachine)
class StateMachineAspect {

	public State currentState
	
	public String unprocessedString
	public String consummedString
	public String producedString 
	
	
	@Main
    def public void main() {
    	try{
    		while (!_self.unprocessedString.isEmpty) {
    			_self.currentState.step(_self.unprocessedString)
    		}    		
		} /* catch (NoTransition nt){
			println("Stopped due to NoTransition"+nt.message)
		} catch (NonDeterminism nt){
			println("Stopped due to NonDeterminism"+nt.message)
		} */ catch (Exception nt){
			println("Stopped due to "+nt.message)
		}
		println("unprocessed string: "+_self.unprocessedString)
		println("processed string: "+_self.consummedString)
		println("produced string: "+_self.producedString)
	}
       
      
    @Step 
	@InitializeModel
	def public void initializeModel(EList<String> args){
		_self.currentState = _self.initialState;
		_self.unprocessedString = args.get(0)
		_self.consummedString = ""
		_self.producedString = ""
	}
	

}


@Aspect(className=State)
class StateAspect {
	@Step
	def public void step(String inputString) {
		// Get the valid transitions	
		val validTransitions =  _self.outgoingTransitions.filter[t | inputString.startsWith(t.input)]
		if(validTransitions.empty) {
			//throw new NoTransition()
			throw new Exception("No Transition")
		}
		if(validTransitions.size > 1) {
			//throw new NonDeterminism()
			throw new Exception("Non Determinism")
			
		}
		// Fire transition
		validTransitions.get(0).fire
	}
}

@Aspect(className=Transition)
class TransitionAspect {
	@Step
	def public void fire() {
		println("Firing " + _self.name + " and entering " + _self.target.name)
		val fsm = _self.source.owningFSM
		fsm.currentState = _self.target
		fsm.producedString = fsm.producedString + _self.output
		fsm.consummedString = fsm.consummedString + _self.input
		fsm.unprocessedString = fsm.unprocessedString.substring(_self.input.length)
	}
}
/* need to be enabled when feature request  */
class NoTransition extends Exception{
	
}
class NonDeterminism extends Exception{
	
}
