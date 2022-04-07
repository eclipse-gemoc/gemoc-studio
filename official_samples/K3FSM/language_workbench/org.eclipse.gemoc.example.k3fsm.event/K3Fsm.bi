BehavioralInterface K3Fsm

accepted event appendString :
	parameters = [fsm:org.eclipse.gemoc.example.k3fsm.FSM, string:java.lang.String]

exposed event transitionFired :
	parameters = [_self:org.eclipse.gemoc.example.k3fsm.Transition]
