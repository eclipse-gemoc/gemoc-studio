package org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateAspectStateAspectProperties;

@SuppressWarnings("all")
public class StateAspectStateAspectContext {
  public final static StateAspectStateAspectContext INSTANCE = new StateAspectStateAspectContext();
  
  public static StateAspectStateAspectProperties getSelf(final State _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateAspectStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<State, StateAspectStateAspectProperties> map = new java.util.WeakHashMap<org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State, org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateAspectStateAspectProperties>();
  
  public Map<State, StateAspectStateAspectProperties> getMap() {
    return map;
  }
}
