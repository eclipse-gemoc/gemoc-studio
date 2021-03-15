package org.tetrabox.minijava.xtext

import org.tetrabox.minijava.xtext.miniJava.Block
import org.tetrabox.minijava.xtext.miniJava.BooleanTypeRef
import org.tetrabox.minijava.xtext.miniJava.ClassRef
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.IntegerTypeRef
import org.tetrabox.minijava.xtext.miniJava.Member
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.Return
import org.tetrabox.minijava.xtext.miniJava.StringTypeRef
import org.tetrabox.minijava.xtext.miniJava.TypeRef
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration
import org.tetrabox.minijava.xtext.miniJava.Interface
import java.util.Set
import org.tetrabox.minijava.xtext.miniJava.TypedDeclaration
import org.tetrabox.minijava.xtext.miniJava.Clazz

class MiniJavaModelUtil {

	def dispatch fields(Clazz c) {
		c.members.filter(Field)
	}

	def dispatch fields(Interface i) {
		#[]
	}

	def methods(TypeDeclaration c) {
		c.members.filter(Method)
	}

	def returnStatement(Method m) {
		m.body.returnStatement
	}

	def returnStatement(Block block) {
		block.statements.filter(Return).head
	}

	def Set<TypeDeclaration> getSuperTypes(TypeDeclaration c) {
		val Set<TypeDeclaration> current = newLinkedHashSet()
		if (c instanceof Clazz) {
			if (c.superClass !== null) {
				current.add(c.superClass)
			}
		}
		current.addAll(c.implementz)
		return current
	}

	def Set<TypeDeclaration> classHierarchy(TypeDeclaration c) {
		val Set<TypeDeclaration> visited = newLinkedHashSet()

		val current = c.superTypes

		while (! current.isEmpty) {
			// Continue visiting
			visited.addAll(current)
			val copy = newLinkedHashSet()
			copy.addAll(current)
			current.clear
			current.addAll(copy.map[superTypes].flatten.filter[!visited.contains(it)])
		}

		visited
	}

	def classHierarchyMethods(TypeDeclaration c) {
		// reverse the list so that methods in subclasses
		// will be added later to the map, thus overriding
		// the one already present in the superclasses
		// if the methods have the same name
		c.classHierarchy.toList.reverseView.map[methods].flatten.toMap[name]
	}

	def classHierarchyMembers(TypeDeclaration c) {
		c.classHierarchy.map[members].flatten
	}

	def memberAsString(Member m) {
		if (m instanceof Member) {
			(if(m.name === null) m.typeRef.name else m.name) + if (m instanceof Method)
				"(" + m.params.map[typeRef.name].join(", ") + ")"
			else
				""
		}
	}

	def memberAsStringWithType(Member m) {
		m.memberAsString + " : " + m.typeRef.name
	}

	def String getName(TypeRef r) {
		val test = switch r {
			ClassRef: r.referencedClass.name
			IntegerTypeRef: "int"
			StringTypeRef: "String"
			BooleanTypeRef: "boolean"
		}
		return test
	}
}
