package org.sbpdiscovery.java.functionalInterfaces;


import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 *		@FunctionalInterface
 * 		public interface Supplier<T> {
 * 			public T get();
 * 		}
 * 
 * A Supplier is used when you want to generate or supply values without
 * taking any input. A supplier is often used when constructiong new
 * objects.
 */
public class SupplierImplementations {

	public static void main(String[] args) {

		// Example 1: Retrieving a date from the system.
		
		Supplier<LocalDate> sd1 = LocalDate::now;
		Supplier<LocalDate> sd2 = () -> LocalDate.now();
		
		LocalDate d1 = sd1.get();
		LocalDate d2 = sd2.get();
		
		System.out.println(d1);
		System.out.println(d2);
		
		// Example 2: Constructing a new StringBuilder object.
		
		Supplier<StringBuilder> ssb1 = StringBuilder::new;
		Supplier<StringBuilder> ssb2 = () -> new StringBuilder();
		
		System.out.println(ssb1.get());
		System.out.println(ssb2.get());
		
		// Example 3: Constructing a new ArrayList<String> object.
		
		Supplier<ArrayList<String>> sals1 = ArrayList<String>::new;
		Supplier<ArrayList<String>> sals2 = () -> new ArrayList<String>();
		
		System.out.println(sals1.get());
		System.out.println(sals2.get());
	}
}
