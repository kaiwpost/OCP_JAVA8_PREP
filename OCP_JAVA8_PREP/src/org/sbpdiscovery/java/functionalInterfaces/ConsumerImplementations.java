package org.sbpdiscovery.java.functionalInterfaces;


import java.util.*;
import java.util.function.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 *		@FunctionalInterface
 * 		public interface Consumer<T> {
 * 			public void accept(T t);
 * 		}
 * 
 * 		@FunctionalInterface
 * 		public interface BiConsumer<T, U> {
 * 			public void accept(T t, U u);
 * 		}
 * 
 * A Consumer is used when you want to do something with a parameter
 * without generating a return value. A BiConsumer does the same thing
 * except that it takes two parameters. Omitting any default or static
 * methods, the interfaces are defined as seen above.
 */
public class ConsumerImplementations {

	public static void main(String[] args) {
		
		// Example 1: Consumer used for printing in a forEach loop.
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = (s) -> System.out.println(s);
		
		c1.accept("Kai");
		c2.accept("Post");
		
		// Example 2: BiConsumer used for placing a key/value pair in a Map.
		
		Map<String, Integer> map = new HashMap<>();
		
		BiConsumer<String, Integer> bc1 = map::put;
		BiConsumer<String, Integer> bc2 = (k, v) -> map.put(k, v);
		
		bc1.accept("Toast", 23);
		bc2.accept("Host", 75);
		
		c1.accept(map.toString());
		c2.accept(map.toString());
	}
}
