package org.eclipse.gemoc.example.k3fsm.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.example.k3fsm.State;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;

// tag::FsmAnimatorServicesClass[]
public class FsmAnimatorServices extends AbstractGemocAnimatorServices {
	@Override
	protected List<StringCouple> getRepresentationRefreshList() {  // <1>
		final List<StringCouple> res = new ArrayList<StringCouple>();
		res.add(new StringCouple("FSM", "Animation"));
		return res;
	}
	
	public boolean isCurrentState(EObject o){     // <2>
		if(o instanceof State){
			return ((State)o).getOwningFSM().getCurrentState() == o;
		} else {
			return false;
		}
	}
}
// end::FsmAnimatorServicesClass[]
