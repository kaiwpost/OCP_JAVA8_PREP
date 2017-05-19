package org.sbpdiscovery.java.functionalInterfaces;


import java.util.function.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 *		@FunctionalInterface
 * 		public interface Function<T, R> {
 * 			public R apply(T t);
 * 		}
 * 
 * 		@FunctionalInterface
 * 		public interface BiFunction<T, U, R> {
 * 			public R apply(T t, U u);
 * 		}
 * 
 * A Function turns a parameter into a vaule of a (most commonly)
 * different type and returning that new value. A BiFunction is 
 * responsible for turning two parameters into a vaule and returning
 * it. Omitting any default or static methods, the interfaces
 * are defined as seen above.
 */
public class FunctionImplementations {

	public static void main(String[] args) {

		// Example 1: Function used for converting a String into its length.
		
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = (t) -> t.length();
		
		System.out.println(f1.apply("Kai"));
		System.out.println(f2.apply("Postman"));
		
		// Example 2: BiFunction used for concatinating two Strings.
		
		BiFunction<String, String, String> bf1 = String::concat;
		BiFunction<String, String, String> bf2 = (a, b) -> a.concat(b);
		
		System.out.println(bf1.apply("Kai ", "Post"));
		System.out.println(bf2.apply("Super ", "Hero"));
	}

}
