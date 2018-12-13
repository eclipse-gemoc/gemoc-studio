package org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateAdapter;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.TransitionAdapter;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.NamedElement;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.State;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.StateMachine;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.Transition;

@SuppressWarnings("all")
public class FSMMTAdaptersFactory implements AdaptersFactory {
  private static FSMMTAdaptersFactory instance;
  
  public static FSMMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public FSMMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.StateMachine){
    	return createStateMachineAdapter((org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.StateMachine) o, res);
    }
    if (o instanceof org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.State){
    	return createStateAdapter((org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.State) o, res);
    }
    if (o instanceof org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.Transition){
    	return createTransitionAdapter((org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.Transition) o, res);
    }
    
    return null;
  }
  
  public StateMachineAdapter createStateMachineAdapter(final StateMachine adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter) adapter;
    else {
    	adapter = new org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateAdapter) adapter;
    else {
    	adapter = new org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.TransitionAdapter) adapter;
    else {
    	adapter = new org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.TransitionAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter) adapter;
    else {
    	adapter = new org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm.NamedElementAdapter) adapter;
    }
  }
}
