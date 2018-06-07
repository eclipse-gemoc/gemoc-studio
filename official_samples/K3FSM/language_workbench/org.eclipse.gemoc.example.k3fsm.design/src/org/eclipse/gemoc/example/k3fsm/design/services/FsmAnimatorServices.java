package org.eclipse.gemoc.example.k3fsm.design.services;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;

// tag::FsmAnimatorServicesClass[]
public class FsmAnimatorServices extends AbstractGemocAnimatorServices {
	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		res.add(new StringCouple("FSM", "Animation"));
		return res;
	}
}
// end::FsmAnimatorServicesClass[]
