package org.eclipse.gemoc.sample.legacyfsm.xsfsm;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmFactory;

@SuppressWarnings("all")
public interface XSFSMMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract FsmFactory getFsmFactory();
  
  public abstract void save(final String uri) throws IOException;
}
