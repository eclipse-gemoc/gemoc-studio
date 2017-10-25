package org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gemoc.sample.legacyfsm.fsm.StateMachine;
import org.eclipse.gemoc.sample.legacyfsm.fsm.Transition;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements org.eclipse.gemoc.sample.legacyfsm.fsm.State {
  private FSMMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public StateMachine getOwningFSM() {
    return (StateMachine) adaptersFactory.createAdapter(adaptee.getOwningFSM(), eResource);
  }
  
  @Override
  public void setOwningFSM(final StateMachine o) {
    if (o != null)
    	adaptee.setOwningFSM(((org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.StateMachineAdapter) o).getAdaptee());
    else adaptee.setOwningFSM(null);
  }
  
  private EList<Transition> outgoingTransitions_;
  
  @Override
  public EList<Transition> getOutgoingTransitions() {
    if (outgoingTransitions_ == null)
    	outgoingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTransitions(), adaptersFactory, eResource);
    return outgoingTransitions_;
  }
  
  private EList<Transition> incomingTransitions_;
  
  @Override
  public EList<Transition> getIncomingTransitions() {
    if (incomingTransitions_ == null)
    	incomingTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTransitions(), adaptersFactory, eResource);
    return incomingTransitions_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__NAME:
    		return getName();
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__OWNING_FSM:
    		return getOwningFSM();
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions();
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__OWNING_FSM:
    		return getOwningFSM() != null;
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__OUTGOING_TRANSITIONS:
    		return getOutgoingTransitions() != null && !getOutgoingTransitions().isEmpty();
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__INCOMING_TRANSITIONS:
    		return getIncomingTransitions() != null && !getIncomingTransitions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__OWNING_FSM:
    		setOwningFSM(
    		(org.eclipse.gemoc.sample.legacyfsm.fsm.StateMachine)
    		 newValue);
    		return;
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__OUTGOING_TRANSITIONS:
    		getOutgoingTransitions().clear();
    		getOutgoingTransitions().addAll((Collection) newValue);
    		return;
    	case org.eclipse.gemoc.sample.legacyfsm.fsm.FsmPackage.STATE__INCOMING_TRANSITIONS:
    		getIncomingTransitions().clear();
    		getIncomingTransitions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
