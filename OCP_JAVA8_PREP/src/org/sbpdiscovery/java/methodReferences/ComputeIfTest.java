package org.sbpdiscovery.java.methodReferences;


import java.util.*;
import java.util.function.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Testing the methods computeIfPresent() and computeIfAbsent().
 */
public class ComputeIfTest {

	public static void main(String[] args) {
		
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);

		BiFunction<String, Integer, Integer> mapper1 = (k, v) -> v + 1;
		
		Integer jenny =  counts.computeIfPresent("Jenny", mapper1);
		Integer sam =  counts.computeIfPresent("Sam", mapper1);
		
		System.out.println(counts);
		System.out.println(jenny);
		System.out.println(sam);
		
		Function<String, Integer> mapper = (k) -> 1;
		
		jenny =  counts.computeIfAbsent("Jenny", mapper);
		sam =  counts.computeIfAbsent("Sam", mapper);
		
		System.out.println(counts);
		System.out.println(jenny);
		System.out.println(sam);
	}
}
