package org.sbpdiscovery.java.methodReferences;


import java.util.*;
import java.util.function.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class MethodReferencesTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/**
		 * Consumer<T> is a FunctionalInterface that takes a single
		 * parameter of any type and has a void return type.
		 */
		Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);
		Consumer<List<Integer>> methRef1 = Collections::sort;
		
		/**
		 * Predicate<T> is a FunctionalInterface that takes a single
		 * parameter of any type and returns a boolean.
		 */
		String string = "abc";
		Predicate<String> lambda2 = s -> string.startsWith(s);
		Predicate<String> methRef2 = string::startsWith;
		
		Predicate<String> lambda3 = s -> string.isEmpty();
		Predicate<String> methRef3 = String::isEmpty;
		
		/**
		 * Supplier<T> is a FunctionalInterface that takes no
		 * parameters of any type and returns any type.
		 */
		Supplier<ArrayList<Object>> lambda4 = () -> new ArrayList<>();
		Supplier<ArrayList<Object>> methRef4 = ArrayList::new;
	}

}
