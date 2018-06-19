package org.eclipse.gemoc.ui.highlighting

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.AbstractRule
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator

public class DslHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
		CancelIndicator cancelIndicator) {
		val INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			val EObject grammarElement = node.getGrammarElement();

			// Node defined by a grammar rule
			if (grammarElement instanceof RuleCall) {
				var RuleCall rc = grammarElement as RuleCall;
				var AbstractRule r = rc.getRule();
				val EObject c = grammarElement.eContainer();
				val EObject ccc = c.eContainer().eContainer();

				// Keys
				if (r.getName().equals("WORD")) {
					if (c instanceof Assignment) {

						// If the WORD is assigned to a feature called "key"
						if (c.feature == "key") {
							acceptor.addPosition(node.getOffset(), node.getLength(),
								DslHighlightingConfiguration.KEY_ID);
						}
					}
				} // Values
				else if (r.name == "VALUE_WORD") {
					acceptor.addPosition(node.getOffset(), node.getLength(), DslHighlightingConfiguration.VALUE_ID);
				} // Separators between keys and values
				else if (r.name == "SEPARATOR") {
					if (ccc instanceof ParserRule) {
						if (ccc.name != "VALUE_WORD") {
							acceptor.addPosition(node.getOffset(), node.getLength(),
								DslHighlightingConfiguration.SEPARATOR_ID);
						}
					}
				}

			} // Node defined by a single keyword
			else if (grammarElement instanceof Keyword) {
				if (grammarElement.value == "\\") {
					acceptor.addPosition(node.getOffset(), node.getLength(),
						org.eclipse.gemoc.ui.highlighting.DslHighlightingConfiguration.LINESEPARATOR_ID);
				}
			}
		}
	}
}
