package org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.gemoc.example.melangek3fsm.fsm.FsmFactory;
import org.eclipse.gemoc.example.melangek3fsm.fsm.FsmPackage;
import org.eclipse.gemoc.example.melangek3fsm.fsm.State;
import org.eclipse.gemoc.example.melangek3fsm.fsm.StateMachine;
import org.eclipse.gemoc.example.melangek3fsm.fsm.Transition;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory;

@SuppressWarnings("all")
public class FsmFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private FSMMTAdaptersFactory adaptersFactory = org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
  
  private org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.FsmFactory fsmAdaptee = org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.FsmFactory.eINSTANCE;
  
  @Override
  public StateMachine createStateMachine() {
    return adaptersFactory.createStateMachineAdapter(fsmAdaptee.createStateMachine(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(fsmAdaptee.createState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(fsmAdaptee.createTransition(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getFsmPackage();
  }
  
  public FsmPackage getFsmPackage() {
    return org.eclipse.gemoc.example.melangek3fsm.fsm.FsmPackage.eINSTANCE;
  }
}
