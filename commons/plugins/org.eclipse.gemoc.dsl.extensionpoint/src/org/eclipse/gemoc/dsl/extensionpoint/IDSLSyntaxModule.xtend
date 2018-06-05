package org.eclipse.gemoc.dsl.extensionpoint

import java.util.Collection
import org.eclipse.gemoc.dsl.Dsl
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.gemoc.dsl.Entry

interface IDSLSyntaxModule {

	enum DSLSyntaxDiagnosticType {
		ERROR,
		WARNING
	}

	@Data
	public static class DSLSyntaxDiagnostic {
		DSLSyntaxDiagnosticType type
		String message
		Collection<Entry> entries
	}

	def boolean isMandatoryKey(String key)

	def boolean isOptionalKey(String key)

	def Collection<DSLSyntaxDiagnostic> analyse(Dsl dsl)

}
