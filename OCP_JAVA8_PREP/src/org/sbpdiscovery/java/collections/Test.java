package org.sbpdiscovery.java.collections;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Test {

	public static <T> T identity(T t) {
		return t;
	}
	
	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, null);
		
		map.merge(1,  3, (a, b) -> a + b);
		map.merge(3,  3, (a, b) -> a + b);
		
		System.out.println(map);
	}
}
