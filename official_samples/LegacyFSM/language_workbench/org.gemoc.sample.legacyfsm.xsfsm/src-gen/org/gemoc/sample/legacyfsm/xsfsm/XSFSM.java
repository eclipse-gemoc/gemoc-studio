/*******************************************************************************
 * Copyright (c) 2015, 2016  Inria  and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.gemoc.sample.legacyfsm.xsfsm;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.sample.legacyfsm.fsm.FSMMT;
import org.gemoc.sample.legacyfsm.xsfsm.XSFSMMT;

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
    org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.XSFSMAdapter adaptee = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.XSFSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XSFSMMT toXSFSMMT() {
    org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMAdapter adaptee = new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
