package org.sbpdiscovery.java.generics;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Main {

	public static final String KEY_1 = "FIRST_KEY";
	public static final Integer VALUE_1 = 125;
	
	public static Generic<String, Integer> generic1 = new Generic<String, Integer>(KEY_1, VALUE_1);
	public static Generic<Integer, String> generic2 = new Generic<>(VALUE_1, KEY_1); // Diamond operator instead of full list when already mentioned in statement.
	
	public static void main(String[] args) {

		Integer gOne = generic1.getValue();	// No casting necessary as the return value can be interpolated for generics.
		String gTwo = generic2.getValue();
		
		System.out.println(gOne);
		System.out.println(gTwo);
	}
}
