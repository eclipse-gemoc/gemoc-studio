package org.eclipse.gemoc.sample.legacyfsm.xsfsm;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eNS_URI,
    	org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor xSFSM = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.eclipse.gemoc.sample.legacyfsm.xsfsm.XSFSM", "", "http://org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm/fsm/", "org.eclipse.gemoc.sample.legacyfsm.xsfsm.XSFSMMT"
    );
    xSFSM.addAdapter("org.eclipse.gemoc.sample.legacyfsm.fsm.FSMMT", org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.XSFSMAdapter.class);
    xSFSM.addAdapter("org.eclipse.gemoc.sample.legacyfsm.xsfsm.XSFSMMT", org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.eclipse.gemoc.sample.legacyfsm.xsfsm.XSFSM",
    	xSFSM
    );
    MelangeRegistry.ModelTypeDescriptor xSFSMMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.eclipse.gemoc.sample.legacyfsm.xsfsm.XSFSMMT", "", "http://org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsmmt/"
    );
    xSFSMMT.addSuperType("org.eclipse.gemoc.sample.legacyfsm.fsm.FSMMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.eclipse.gemoc.sample.legacyfsm.xsfsm.XSFSMMT",
    	xSFSMMT
    );
  }
}
