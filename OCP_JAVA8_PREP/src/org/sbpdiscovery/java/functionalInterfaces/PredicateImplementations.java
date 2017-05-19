package org.sbpdiscovery.java.functionalInterfaces;


import java.util.function.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 *		@FunctionalInterface
 * 		public interface Predicate<T> {
 * 			public boolean test(T t);
 * 		}
 * 
 * 		@FunctionalInterface
 * 		public interface BiPredicate<T, U> {
 * 			public boolean test(T t, U u);
 * 		}
 * 
 * A Predicate is often used when filtering or matching, two vey
 * common operations. A BiPredicate does the same thing except that
 * it takes two parameters. Omitting any default or static methods,
 * the interfaces are defined as seen above.
 */
public class PredicateImplementations {

	public static void main(String[] args) {

		// Example 1: Predicate used for testing if a String object is empty.
		
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = (s) -> s.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p2.test("Kai"));
		
		// Example 1: BiPredicate used for testing if a String starts with a given prefix.
		
		BiPredicate<String, String> bp1 = String::startsWith;
		BiPredicate<String, String> bp2 = (s, p) -> s.startsWith(p);
		
		System.out.println(bp1.test("Kai", "K"));
		System.out.println(bp2.test("Kai", "horse"));
	}

}
