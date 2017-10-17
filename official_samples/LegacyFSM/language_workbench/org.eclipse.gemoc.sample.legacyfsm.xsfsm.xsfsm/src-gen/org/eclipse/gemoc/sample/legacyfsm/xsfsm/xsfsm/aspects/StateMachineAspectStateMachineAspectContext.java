/*******************************************************************************
 * Copyright (c) 2015, 2017  Inria  and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectContext {
  public final static StateMachineAspectStateMachineAspectContext INSTANCE = new StateMachineAspectStateMachineAspectContext();
  
  public static StateMachineAspectStateMachineAspectProperties getSelf(final StateMachine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StateMachine, StateMachineAspectStateMachineAspectProperties> map = new java.util.WeakHashMap<org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine, org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspectStateMachineAspectProperties>();
  
  public Map<StateMachine, StateMachineAspectStateMachineAspectProperties> getMap() {
    return map;
  }
}
