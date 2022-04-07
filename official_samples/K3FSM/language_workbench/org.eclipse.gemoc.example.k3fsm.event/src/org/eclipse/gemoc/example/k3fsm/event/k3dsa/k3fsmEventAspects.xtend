package org.eclipse.gemoc.example.k3fsm.event.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.gemoc.example.k3fsm.FSM

@Aspect(className=FSM)
class FSMAspect {
	@Step
	def void appendStringToProcess(String arg) {
		val s = _self.unprocessedString
		_self.unprocessedString = s + arg
	}
}


