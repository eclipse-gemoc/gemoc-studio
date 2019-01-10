package org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory;
import org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.NamedElement;

@SuppressWarnings("all")
public class NamedElementAdapter extends EObjectAdapter<NamedElement> implements org.eclipse.gemoc.example.melangek3fsm.fsm.NamedElement {
  private FSMMTAdaptersFactory adaptersFactory;
  
  public NamedElementAdapter() {
    super(org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.eclipse.gemoc.example.melangek3fsm.fsm.FsmPackage.eINSTANCE.getNamedElement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.eclipse.gemoc.example.melangek3fsm.fsm.FsmPackage.NAMED_ELEMENT__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.eclipse.gemoc.example.melangek3fsm.fsm.FsmPackage.NAMED_ELEMENT__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.eclipse.gemoc.example.melangek3fsm.fsm.FsmPackage.NAMED_ELEMENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
