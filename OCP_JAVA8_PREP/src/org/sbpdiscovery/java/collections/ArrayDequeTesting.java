package org.sbpdiscovery.java.collections;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class ArrayDequeTesting {

	private static ArrayDeque<String> greetings = new ArrayDeque<>();
	
	public static void main(String[] args) {
		
		greetings.push("Hello");
		System.out.println(greetings);
		
		greetings.push("Hi");
		System.out.println(greetings);
		
		greetings.push("Hola");
		System.out.println(greetings);
		
		System.out.println(greetings.pop());
		System.out.println(greetings.peek());
		while(greetings.peek() != null)
			System.out.print(greetings.pop());
	}
}
