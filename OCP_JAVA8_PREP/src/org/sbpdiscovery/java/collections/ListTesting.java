package org.sbpdiscovery.java.collections;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class ListTesting {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);					// With utoboxing.
		numbers.add(new Integer(3));	// Without autoboxing.
		numbers.add(new Integer(5));	// Without autoboxing.
		
		numbers.remove(1);				// Overloaded method: Removes member at location 1 (i.e. the 3).
		numbers.remove(new Integer(5));	// Overloaded method: Removes the matching member (i.e. the 5).

		System.out.println(numbers);
	}
}
