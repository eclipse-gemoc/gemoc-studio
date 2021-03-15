package org.tetrabox.minijava.xtext.scoping

import com.google.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor
import org.tetrabox.minijava.xtext.miniJava.Block

@Singleton
class MiniJavaResourceDescriptionsStrategy extends DefaultResourceDescriptionStrategy {

	override createEObjectDescriptions(EObject e, IAcceptor<IEObjectDescription> acceptor) {
		if (e instanceof Block) {
			// don't index contents of a block
			false
		} else
			super.createEObjectDescriptions(e, acceptor)
	}
}
