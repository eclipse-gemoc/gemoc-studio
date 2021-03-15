package fr.inria.diverse.minijava_repl.xtext.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import java.util.Collections

class MiniJava_replScopeProvider extends AbstractMiniJava_replScopeProvider {
	override getScope(EObject context, EReference reference) {
		var baseScope = super.getScope(context, reference)
		var interpreterScope = scopeForInterpretableInstruction(context)
		
		return Scopes.scopeFor(baseScope.allElements.map[it.EObjectOrProxy], interpreterScope)
	}
	
	def protected IScope scopeForInterpretableInstruction(EObject context) {
		if (context.eClass.EAllSuperTypes.exists[it.name.equals("InterpretableInstruction")]) {
			var previous = context.eGet(context.eClass.getEStructuralFeature("previous")) as EObject
			if (previous === null) {
				return IScope.NULLSCOPE
			}
			if (previous.eClass.name.equals("Help")) {
				return scopeForInterpretableInstruction(previous)
			}
			return Scopes.scopeFor(
					Collections.singleton(
							previous.eGet(previous.eClass.getEStructuralFeature("original")) as EObject),
					scopeForInterpretableInstruction(previous))
		}
		if (context.eContainer === null) {
			return IScope.NULLSCOPE
		}
		return scopeForInterpretableInstruction(context.eContainer)
	}
}