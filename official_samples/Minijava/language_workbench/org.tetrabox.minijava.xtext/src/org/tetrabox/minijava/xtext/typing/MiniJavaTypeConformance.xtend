package org.tetrabox.minijava.xtext.typing

import com.google.inject.Inject
import org.tetrabox.minijava.xtext.MiniJavaModelUtil
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration

import static org.tetrabox.minijava.xtext.typing.MiniJavaTypeComputer.*

class MiniJavaTypeConformance {

	@Inject extension MiniJavaModelUtil

	def isConformant(TypeDeclaration c1, TypeDeclaration c2) {
		c1 === NULL_TYPE || // null can be assigned to everything
		c1 === c2 || c1.isSubclassOf(c2)
	}

	def isSubclassOf(TypeDeclaration c1, TypeDeclaration c2) {
		c1.classHierarchy.contains(c2)
	}
}
