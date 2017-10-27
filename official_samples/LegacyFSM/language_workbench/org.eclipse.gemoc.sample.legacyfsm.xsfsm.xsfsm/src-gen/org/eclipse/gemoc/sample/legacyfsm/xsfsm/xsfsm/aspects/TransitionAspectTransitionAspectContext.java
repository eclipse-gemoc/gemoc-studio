package org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspectTransitionAspectProperties;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public final static TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();
  
  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition, org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.TransitionAspectTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
