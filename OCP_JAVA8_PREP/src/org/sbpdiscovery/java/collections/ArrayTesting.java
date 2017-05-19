package org.sbpdiscovery.java.collections;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class ArrayTesting {

	public static void main(String[] args) {
		
		String[] array = {"cat", "dog", "gerbil", "mouse"};
		List<String> list = Arrays.asList(array);
		System.out.println(list.getClass());
	}
}
