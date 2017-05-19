package org.sbpdiscovery.java.methodReferences;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Testing the map method merge().
 */
public class MergeTest {

	public static void main(String[] args) {
		
		BiFunction<String, String, String> mapper =
			(v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		
		Map<String, String> map = new HashMap<>();
		
		map.put("Kai", "Programmer");
		map.put("Andrew", "Statistician");
		map.put("Thomas", "Bioinformatitian");
		map.put("Adam", "Principle Investigator");
		map.put("Alexey", "Scientific Director");
		
		System.out.println(map);
		
		String kai = map.merge("Kai", "Soopavizaah", mapper);
		
		System.out.println(kai);
		
		System.out.println(map);
	}
}
