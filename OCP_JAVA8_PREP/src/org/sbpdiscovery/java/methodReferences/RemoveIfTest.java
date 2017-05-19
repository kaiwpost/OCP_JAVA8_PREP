package org.sbpdiscovery.java.methodReferences;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * this method new in Java 8 allows for the removal of all elements of
 * a List that meet the filter criteria.
 * 
 * boolean removeIf(Predicate<? super E> filter)
 */
public class RemoveIfTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Programmer");
		list.add("Statistician");
		list.add("Bioinformatitian");
		list.add("Principle Investigator");
		list.add("Scientific Director");
		
		list.stream().forEach(System.out::println);
		
		list.removeIf(s -> s.startsWith("P"));
		
		list.stream().forEach(System.out::println);
	}
}
