package org.sbpdiscovery.java.functionalInterfaces;


import java.util.function.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 *		@FunctionalInterface
 * 		public interface UnaryOperator<T> extends Function<T, T> {}
 * 
 * 		@FunctionalInterface
 * 		public interface BinaryOperator<T> extends BiFunction<T, T, T> {}
 * 
 * UnaryOperator and BinaryOperator functional ineterfaces require all
 * type parameters to be the same. A UnaryOperator performs a unary
 * operation onto one parameter and returns the resulting value. A
 * BinaryOperator does the same thing with two parameters and a binary
 * operation. Omitting any default or static methods, the interfaces
 * are defined as seen above.
 */
public class OperatorImplementations {

	public static void main(String[] args) {
		
		// Example 1: UnaryOperator used for converting a String to
		// upper case or an integer to its square.
		
		UnaryOperator<String> uo1 = String::toUpperCase;
		UnaryOperator<Integer> uo2 = x -> x * x;
		
		System.out.println(uo1.apply("Kai"));
		System.out.println(uo2.apply(12));
		
		// Example 2: BinaryOperator used for concatinating two Strings
		// or multiplying to Integers.
		
		BinaryOperator<String> bo1 = String::concat;
		BinaryOperator<Integer> bo2 = (x, y) -> x * y;
		
		System.out.println(bo1.apply("Kai ", "Post"));
		System.out.println(bo2.apply(12, 3));
	} 
}
