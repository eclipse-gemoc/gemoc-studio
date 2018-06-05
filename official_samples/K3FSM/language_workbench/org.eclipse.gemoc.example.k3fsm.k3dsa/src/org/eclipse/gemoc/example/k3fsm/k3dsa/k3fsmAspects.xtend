package org.eclipse.gemoc.example.k3fsm.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.gemoc.example.k3fsm.FSM
import org.eclipse.gemoc.example.k3fsm.State
import org.eclipse.gemoc.example.k3fsm.Transition
import org.eclipse.emf.common.util.EList
	
import static extension org.eclipse.gemoc.example.k3fsm.k3dsa.TransitionAspect.*
import static extension org.eclipse.gemoc.example.k3fsm.k3dsa.FSMAspect.*			
import static extension org.eclipse.gemoc.example.k3fsm.k3dsa.StateAspect.*			

@Aspect(className=FSM)
class FSMAspect {
	@Step 												
	@InitializeModel									// <1>
	def public void initializeModel(EList<String> args){
		_self.currentState = _self.initialState;
		_self.unprocessedString = args.get(0)	
		_self.consummedString = ""
		_self.producedString = ""
		if(_self.unprocessedString.isEmpty) {
			println("nothing to process, did you forgot to pass parameters to the launch configuration ?")
		}
	}
		
	@Main												// <2>
	def public void main() {
    	try {
    		while (!_self.unprocessedString.isEmpty) {
    			_self.currentState.step(_self.unprocessedString)
    		}    		
		} catch (FSMRuntimeException nt){
			println("Stopped due to "+nt.message)
		}
		println("unprocessed string: "+_self.unprocessedString)
		println("processed string: "+_self.consummedString)
		println("produced string: "+_self.producedString)
	}
}

@Aspect(className=State)
class StateAspect {
	@Step												// <3>
	def public void step(String inputString) {
		// Get the valid transitions	
		val validTransitions =  _self.outgoingTransitions.filter[t | inputString.startsWith(t.input)]
		if(validTransitions.empty) {
			throw new FSMRuntimeException("No Transition")
		}
		if(validTransitions.size > 1) {
			throw new FSMRuntimeException("Non Determinism")
			
		}
		// Fire transition		
		validTransitions.get(0).fire()
	}
}

@Aspect(className=Transition)
class TransitionAspect {
	
	@Step												// <4>
	def public void fire() {
		println("Firing " + _self.name + " and entering " + _self.target.name)
		val fsm = _self.source.owningFSM
		fsm.currentState = _self.target
		fsm.producedString = fsm.producedString + _self.output
		fsm.consummedString = fsm.consummedString + _self.input
		fsm.unprocessedString = fsm.unprocessedString.substring(_self.input.length)
	}
}

class FSMRuntimeException extends Exception {
	new(String message) {
		super(message)
	}				
}


