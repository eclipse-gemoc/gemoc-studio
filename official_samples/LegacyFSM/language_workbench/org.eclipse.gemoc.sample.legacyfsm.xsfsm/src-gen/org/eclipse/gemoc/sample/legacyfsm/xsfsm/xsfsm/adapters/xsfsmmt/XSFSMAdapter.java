package org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.XSFSMMT;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmFactory;

@SuppressWarnings("all")
public class XSFSMAdapter extends ResourceAdapter implements XSFSMMT {
  public XSFSMAdapter() {
    super(org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance());
  }
  
  @Override
  public FsmFactory getFsmFactory() {
    return new org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm.FsmFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getFsmFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
