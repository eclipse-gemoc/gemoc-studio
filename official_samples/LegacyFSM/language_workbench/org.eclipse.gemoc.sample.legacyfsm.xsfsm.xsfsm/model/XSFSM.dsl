DSL org.eclipse.gemoc.sample.legacyfsm.xsfsm.XSFSM {
	abstract-syntax {
		ecore = "platform:/resource/org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm/model/XSFSM.ecore"
	}
	semantic {
		k3 = "org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateAspect",
		"org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspect",
		"org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspect"
	}
}
