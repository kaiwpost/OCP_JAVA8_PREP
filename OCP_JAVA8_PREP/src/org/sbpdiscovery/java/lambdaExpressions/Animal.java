package org.sbpdiscovery.java.lambdaExpressions;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Animal {

	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String species, boolean canHop, boolean canSwim) {
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}
	
	public boolean canHop() { return canHop; }
	public boolean canSwim() { return canSwim; }

	@Override
	public String toString() {
		return
			"Animal [species=" + species + ", canHop=" + canHop +
			", canSwim=" + canSwim + "]";
	}
	
	
}
