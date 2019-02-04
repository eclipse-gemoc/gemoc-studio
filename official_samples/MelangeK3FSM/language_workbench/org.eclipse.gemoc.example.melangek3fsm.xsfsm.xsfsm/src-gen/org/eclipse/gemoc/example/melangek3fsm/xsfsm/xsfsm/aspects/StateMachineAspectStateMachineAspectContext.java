package org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.StateMachine;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectContext {
  public final static StateMachineAspectStateMachineAspectContext INSTANCE = new StateMachineAspectStateMachineAspectContext();
  
  public static StateMachineAspectStateMachineAspectProperties getSelf(final StateMachine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StateMachine, StateMachineAspectStateMachineAspectProperties> map = new java.util.WeakHashMap<org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.StateMachine, org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties>();
  
  public Map<StateMachine, StateMachineAspectStateMachineAspectProperties> getMap() {
    return map;
  }
}
