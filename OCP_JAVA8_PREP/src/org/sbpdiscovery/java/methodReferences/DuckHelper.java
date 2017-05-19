package org.sbpdiscovery.java.methodReferences;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class DuckHelper {

	public static int compareByName(Duck duck1, Duck duck2) {
		return duck1.getName().compareTo(duck2.getName());
	}
	
	public static int compareByWeight(Duck duck1, Duck duck2) {
		return duck1.getWeight() - duck2.getWeight();
	}
}
