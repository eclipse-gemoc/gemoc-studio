package org.eclipse.gemoc.sample.legacyfsm.xsfsm;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gemoc.sample.legacyfsm.fsm.FSMMT;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.XSFSMMT;

@SuppressWarnings("all")
public class XSFSM implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XSFSM load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XSFSM mm = new XSFSM();
    mm.setResource(res);
    return mm ;
  }
  
  public FSMMT toFSMMT() {
    org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.XSFSMAdapter adaptee = new org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.XSFSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XSFSMMT toXSFSMMT() {
    org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMAdapter adaptee = new org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
