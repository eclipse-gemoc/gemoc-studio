package highlighting

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.gemoc.services.DslGrammarAccess
import org.eclipse.xtext.AbstractRule
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.common.types.util.AnnotationLookup
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.service.OperationCanceledManager
import org.eclipse.xtext.util.CancelIndicator

//TODO rewrite
public class DslHighlightingCalculator extends DefaultSemanticHighlightingCalculator  {


// TODO useful? copied from xbase org.eclipse.xtext.xbase.ide.highlighting.XbaseHighlightingCalculator
//	@Inject
//	private DslGrammarAccess grammarAccess;
//
//	@Inject
//	private AnnotationLookup annotationLookup;
//
//	@Inject
//	private OperationCanceledManager operationCanceledManager;

	// TODO must be rewritten entirely, this is a default example
	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
		CancelIndicator cancelIndicator) {
		// It gets a node model.
		val INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			val EObject grammarElement = node.getGrammarElement();
			if (grammarElement instanceof RuleCall) {
				var RuleCall rc = grammarElement as RuleCall;
				var AbstractRule r = rc.getRule();
				val Object c = grammarElement.eContainer();

				// It tests whether the node represents a name of an element (class, method, parameter).
				if (r.getName().equals("ID") && c instanceof Assignment &&
					(c as Assignment).getFeature().equals("name")) {
					val INode p = node.getParent();
					if (p !== null && p.getGrammarElement() instanceof RuleCall) {
						rc = p.getGrammarElement() as RuleCall;
						r = rc.getRule();

						// It tests whether the parent node represents a method.                        
						if (r.getName().equals("Method")) {
							acceptor.addPosition(node.getOffset(), node.getLength(), "SOMECUSTOMID");
						}
					}
				}
			}
		}
	}

}
