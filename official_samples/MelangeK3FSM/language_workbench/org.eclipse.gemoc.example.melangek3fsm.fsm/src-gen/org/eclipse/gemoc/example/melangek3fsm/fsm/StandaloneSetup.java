package org.eclipse.gemoc.example.melangek3fsm.fsm;

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
    	org.eclipse.gemoc.example.melangek3fsm.fsm.FsmPackage.eNS_URI,
    	org.eclipse.gemoc.example.melangek3fsm.fsm.FsmPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor fSM = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.eclipse.gemoc.example.melangek3fsm.fsm.FSM", "", "http://www.gemoc.org/legacyfsm/fsm", "org.eclipse.gemoc.example.melangek3fsm.fsm.FSMMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.eclipse.gemoc.example.melangek3fsm.fsm.FSM",
    	fSM
    );
    MelangeRegistry.ModelTypeDescriptor fSMMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.eclipse.gemoc.example.melangek3fsm.fsm.FSMMT", "", "http://org.eclipse.gemoc.example.melangek3fsm.fsm.fsmmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.eclipse.gemoc.example.melangek3fsm.fsm.FSMMT",
    	fSMMT
    );
  }
}
