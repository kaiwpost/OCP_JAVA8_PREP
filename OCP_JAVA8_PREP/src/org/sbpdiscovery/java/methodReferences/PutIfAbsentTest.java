package org.sbpdiscovery.java.methodReferences;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Testing the map method putIfAbsent(K key, V value).
 */
public class PutIfAbsentTest {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("Kai", "Programmer");
		map.put("Andrew", "Statistician");
		map.put("Thomas", "Bioinformatitian");
		map.put("Adam", "Principle Investigator");
		map.put("Alexey", "Scientific Director");
		
		System.out.println(map);
		
		map.putIfAbsent("Kai", "Programmer");
		map.putIfAbsent("Cindy", "Admin");
		
		System.out.println(map);
	}
}
