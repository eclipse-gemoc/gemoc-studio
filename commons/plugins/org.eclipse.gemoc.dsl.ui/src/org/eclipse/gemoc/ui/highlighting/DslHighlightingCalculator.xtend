package org.eclipse.gemoc.ui.highlighting

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.AbstractRule
import org.eclipse.xtext.Assignment
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
			if (grammarElement instanceof RuleCall) {
				var RuleCall rc = grammarElement as RuleCall;
				var AbstractRule r = rc.getRule();
				val EObject c = grammarElement.eContainer();
				val EObject ccc = c.eContainer().eContainer();

				// If it is a "WORD"
				if (r.getName().equals("WORD")) {
					if (c instanceof Assignment) {

						// assigned to a feature called "key"
						if (c.feature == "key") {
							acceptor.addPosition(node.getOffset(), node.getLength(),
								DslHighlightingConfiguration.KEY_ID);
						}

					}
				} // If it is a "MULTILINE", ie. a value
				else if (r.name == "MULTILINE") {
					acceptor.addPosition(node.getOffset(), node.getLength(), DslHighlightingConfiguration.VALUE_ID);
				} // If it is a "SEPARATOR"
				else if (r.name == "SEPARATOR") {
					if (ccc instanceof ParserRule) {

						// that is not part of a "VALUE_WORD" container, ie. that separates keys and values 
						if (ccc.name == "VALUE_WORD") {
							acceptor.addPosition(node.getOffset(), node.getLength(),
								DslHighlightingConfiguration.SEPARATOR_ID);
						}
					}
				}
			}
		}

	}
}
