package org.eclipse.gemoc.example.k3fsm.design;

import org.eclipse.gemoc.example.k3fsm.Transition;

/**
 * The services class used by VSM.
 */
public class Services {
    
	/**
	 * Gets the label for the given {@link Transition}.
	 * 
	 * @param transition
	 *            the {@link Transition}
	 * @return the label for the given {@link Transition}
	 */
	public String getLabel(Transition transition) {
		final StringBuilder res = new StringBuilder();

		res.append(transition.getName());
		res.append("\n");	
		res.append("");
		res.append(transition.getInput());
		res.append(" / ");
		res.append(transition.getOutput());	
		return res.toString();
	}
}
