package org.sbpdiscovery.java.methodReferences;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * this method new in Java 8 allows you to pass a lambda expression
 * and have it applied to all elements in the List.
 * 
 * void replaceAll(UnaryOperator<E> o)
 */
public class ReplaceAllTest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3);
		
		list.stream().forEach(System.out::println);
		
		list.replaceAll(x -> x * 2);
		
		list.stream().forEach(System.out::println);
	}

}
