package org.sbpdiscovery.java.nestedClasses;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Static Nested Classes: Static Nested Classes are static classes defined
 * at the member level. They can be instantiated without an object of the
 * enclosing class.
 */
public class Enclosing {
	
	static class Nested {
		private int price = 6;
	}

	public static void main(String[] args) {
		System.out.println(new Nested().price);
	}

}
