package org.eclipse.gemoc.example.k3fsm.event;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.gemoc.executionframework.behavioralinterface.behavioralInterface.BehavioralInterface;
import org.eclipse.gemoc.executionframework.event.manager.IImplementationRelationship;
import org.eclipse.gemoc.executionframework.event.manager.SimpleImplementationRelationship;

public class K3FsmImplementationRelationship extends SimpleImplementationRelationship {

	private static Map<String, String> computeEventToMethodMap() {
		final Map<String, String> result = new HashMap<>();
		result.put("appendString", "org.eclipse.gemoc.example.k3fsm.event.k3dsa.FSMAspect.appendStringToProcess");
		result.put("transitionFired", "org.eclipse.gemoc.example.k3fsm.Transition.fire");
		return result;
	}
	
	public K3FsmImplementationRelationship() {
		this(IImplementationRelationship.loadBehavioralInterface("platform:/plugin/org.eclipse.gemoc.example.k3fsm.event/K3Fsm.bi"));
	}
	
	public K3FsmImplementationRelationship(BehavioralInterface behavioralInterface) {
		super(behavioralInterface, Collections.emptySet(), computeEventToMethodMap(), "org.eclipse.gemoc.metaprog.kermeta3");
	}

}
