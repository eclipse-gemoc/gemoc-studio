package org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.StateMachine;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.State;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.Transition;

@SuppressWarnings("all")
public class StateMachineAdapter extends EObjectAdapter<StateMachine> implements org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine {
  private XSFSMMTAdaptersFactory adaptersFactory;
  
  public StateMachineAdapter() {
    super(org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<State> ownedStates_;
  
  @Override
  public EList<State> getOwnedStates() {
    if (ownedStates_ == null)
    	ownedStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedStates(), adaptersFactory, eResource);
    return ownedStates_;
  }
  
  @Override
  public State getInitialState() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitialState(), eResource);
  }
  
  @Override
  public void setInitialState(final State o) {
    if (o != null)
    	adaptee.setInitialState(((org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setInitialState(null);
  }
  
  private EList<Transition> ownedTransitions_;
  
  @Override
  public EList<Transition> getOwnedTransitions() {
    if (ownedTransitions_ == null)
    	ownedTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedTransitions(), adaptersFactory, eResource);
    return ownedTransitions_;
  }
  
  @Override
  public String getConsummedString() {
    return org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspect.consummedString(adaptee);
  }
  
  @Override
  public void setConsummedString(final String consummedString) {
    org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspect.consummedString(adaptee, consummedString
    );
  }
  
  @Override
  public State getCurrentState() {
    return (State) adaptersFactory.createAdapter(org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspect.currentState(adaptee), eResource);
  }
  
  @Override
  public void setCurrentState(final State currentState) {
    org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspect.currentState(adaptee, (org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.State)((EObjectAdapter)currentState).getAdaptee()
    );
  }
  
  @Override
  public void initializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspect.initializeModel(adaptee, args
    );
  }
  
  @Override
  public void main() {
    org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspect.main(adaptee);
  }
  
  @Override
  public String getProducedString() {
    return org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspect.producedString(adaptee);
  }
  
  @Override
  public void setProducedString(final String producedString) {
    org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspect.producedString(adaptee, producedString
    );
  }
  
  @Override
  public String getUnprocessedString() {
    return org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspect.unprocessedString(adaptee);
  }
  
  @Override
  public void setUnprocessedString(final String unprocessedString) {
    org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.aspects.StateMachineAspect.unprocessedString(adaptee, unprocessedString
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String UNPROCESSED_STRING_EDEFAULT = null;
  
  protected final static String CONSUMMED_STRING_EDEFAULT = null;
  
  protected final static String PRODUCED_STRING_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.eINSTANCE.getStateMachine();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__NAME:
    		return getName();
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_STATES:
    		return getOwnedStates();
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__INITIAL_STATE:
    		return getInitialState();
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_TRANSITIONS:
    		return getOwnedTransitions();
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__CURRENT_STATE:
    		return getCurrentState();
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__UNPROCESSED_STRING:
    		return getUnprocessedString();
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__CONSUMMED_STRING:
    		return getConsummedString();
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__PRODUCED_STRING:
    		return getProducedString();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_STATES:
    		return getOwnedStates() != null && !getOwnedStates().isEmpty();
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__INITIAL_STATE:
    		return getInitialState() != null;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_TRANSITIONS:
    		return getOwnedTransitions() != null && !getOwnedTransitions().isEmpty();
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__CURRENT_STATE:
    		return getCurrentState() != null;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__UNPROCESSED_STRING:
    		return getUnprocessedString() != UNPROCESSED_STRING_EDEFAULT;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__CONSUMMED_STRING:
    		return getConsummedString() != CONSUMMED_STRING_EDEFAULT;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__PRODUCED_STRING:
    		return getProducedString() != PRODUCED_STRING_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_STATES:
    		getOwnedStates().clear();
    		getOwnedStates().addAll((Collection) newValue);
    		return;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__INITIAL_STATE:
    		setInitialState(
    		(org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.State)
    		 newValue);
    		return;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__OWNED_TRANSITIONS:
    		getOwnedTransitions().clear();
    		getOwnedTransitions().addAll((Collection) newValue);
    		return;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__CURRENT_STATE:
    		setCurrentState(
    		(org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.State)
    		 newValue);
    		return;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__UNPROCESSED_STRING:
    		setUnprocessedString(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__CONSUMMED_STRING:
    		setConsummedString(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage.STATE_MACHINE__PRODUCED_STRING:
    		setProducedString(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
