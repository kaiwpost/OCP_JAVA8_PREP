package org.sanfordburnham.java.assertions;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class AssertionsTest {

	public static void main(String[] args) {
		int numberOfGuests = -5;
		assert numberOfGuests > 0;
		System.out.println(numberOfGuests);
	}

}
