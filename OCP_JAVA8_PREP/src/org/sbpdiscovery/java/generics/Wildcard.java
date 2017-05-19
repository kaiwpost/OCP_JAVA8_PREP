package org.sbpdiscovery.java.generics;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Wildcard {

	public void showSize(List<?> list) {
		System.out.println(list.size());
	}
	
	public static void main(String[] args) {
		
		Wildcard card = new Wildcard();
		
		// Which of these five statements will allow the class to compile?
		// NO!!! Not a list! ArrayDeque<?>. list = new ArrayDeque<String>();
		// YES!!! ArrayList<? super Date>. list = new ArrayList<Date>();
		// NO!!! Cannot instantiate the type ArrayList<?>. List<?> list = new ArrayList<String>();
		// NO!!! Type mismatch. List<Exception> list = new LinkedList<java.io.IOException>();
		Vector<? extends Number> list = new Vector<Integer>();
		
		card.showSize(list);
	}

}
