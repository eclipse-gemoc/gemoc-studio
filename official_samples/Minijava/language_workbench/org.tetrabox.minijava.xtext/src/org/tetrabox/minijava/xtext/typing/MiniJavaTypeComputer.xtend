package org.tetrabox.minijava.xtext.typing

import org.tetrabox.minijava.xtext.miniJava.Assignment
import org.tetrabox.minijava.xtext.miniJava.BoolConstant
import org.tetrabox.minijava.xtext.miniJava.BooleanTypeRef
import org.tetrabox.minijava.xtext.miniJava.Clazz
import org.tetrabox.minijava.xtext.miniJava.ClassRef
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.xtext.miniJava.IntConstant
import org.tetrabox.minijava.xtext.miniJava.IntegerTypeRef
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage
import org.tetrabox.minijava.xtext.miniJava.Null
import org.tetrabox.minijava.xtext.miniJava.Return
import org.tetrabox.minijava.xtext.miniJava.StringConstant
import org.tetrabox.minijava.xtext.miniJava.StringTypeRef
import org.tetrabox.minijava.xtext.miniJava.Super
import org.tetrabox.minijava.xtext.miniJava.SymbolRef
import org.tetrabox.minijava.xtext.miniJava.This
import org.tetrabox.minijava.xtext.miniJava.TypeRef
import org.tetrabox.minijava.xtext.miniJava.VariableDeclaration

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.tetrabox.minijava.xtext.miniJava.FieldAccess
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.VoidTypeRef
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration
import org.tetrabox.minijava.xtext.miniJava.Interface
import org.tetrabox.minijava.xtext.miniJava.TypedDeclaration
import org.tetrabox.minijava.xtext.miniJava.NewObject

class MiniJavaTypeComputer {
	private static val factory = MiniJavaFactory.eINSTANCE
	public static val STRING_TYPE = factory.createClazz => [name = 'stringType']
	public static val INT_TYPE = factory.createClazz => [name = 'intType']
	public static val BOOLEAN_TYPE = factory.createClazz => [name = 'booleanType']
	public static val NULL_TYPE = factory.createClazz => [name = 'nullType']

	static val ep = MiniJavaPackage.eINSTANCE

	def TypeDeclaration getType(TypeRef r) {
		switch r {
			ClassRef: r.referencedClass
			IntegerTypeRef: INT_TYPE
			BooleanTypeRef: BOOLEAN_TYPE
			StringTypeRef: STRING_TYPE
			VoidTypeRef : NULL_TYPE
		}
	}

	def TypeDeclaration typeFor(Expression e) {
		switch (e) {
			SymbolRef:
				e.symbol.typeRef.type
			FieldAccess:
				e.field.typeRef.type
			MethodCall:
				e.method.typeRef.type
			NewObject:
				e.type
			This:
				e.getContainerOfType(Clazz)
			Super:
				e.getContainerOfType(Clazz).superClass
			Null:
				NULL_TYPE
			StringConstant:
				STRING_TYPE
			IntConstant:
				INT_TYPE
			BoolConstant:
				BOOLEAN_TYPE
		}
	}


	def isPrimitive(TypeDeclaration c) {
		c.eResource === null
	}

	def TypeDeclaration expectedType(Expression e) {
		val c = e.eContainer
		val f = e.eContainingFeature
		switch (c) {
			VariableDeclaration:
				c.typeRef.type
			Assignment case f == ep.assignment_Value: {
				val assignee = c.assignee
				switch (assignee) {
					VariableDeclaration: assignee.typeRef.type
					FieldAccess: assignee.typeFor
				}
			}
			Return:
				c.getContainerOfType(Method).typeRef.type
			case f == ep.ifStatement_Expression:
				BOOLEAN_TYPE
			MethodCall case f == ep.methodCall_Args: {
				if (c.method !== null) {
				if (c.method.params.size > c.args.indexOf(e))
					c.method.params.get(c.args.indexOf(e)).typeRef.type
				}
			}
			NewObject case f == ep.newObject_Args: {
				c.type.members.filter(Method).findFirst[it.name === null && it.params.size === c.args.size].params.get(c.args.indexOf(e)).typeRef.type
			}
		}
	}
}
