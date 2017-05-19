package org.sbpdiscovery.java.methodReferences;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Method References are compact lambda expressions for methods theat already
 * have a name.
 */
public class CompareDucks {

	public static void main(String[] args) {
		
		Duck huey = new Duck("Huey", 125);
		Duck dewey = new Duck("Dewey", 129);
		Duck louie = new Duck("Louie", 132);
		Duck daisy = new Duck("Daisy", 154);
		Duck donald = new Duck("Donald", 182);
		Duck scrooge = new Duck("Scrooge", 171);
		
		/**
		 * The first Comparoator definition using a full lambda expression. It also uses
		 * a full lambda in the foreach loop printing out the elements.
		 */
		Comparator<Duck> byName = (duck1, duck2) -> DuckHelper.compareByName(duck1, duck2);

		TreeSet<Duck> ducks1 = new TreeSet<>(byName);
		
		ducks1.add(huey);
		ducks1.add(dewey);
		ducks1.add(louie);
		ducks1.add(daisy);
		ducks1.add(donald);
		ducks1.add(scrooge);
		
		long start1 = System.currentTimeMillis();
		ducks1.stream().forEach(duck -> System.out.println(duck));
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);
		
		/**
		 * The second Comparator using a method reference.  It also uses
		 * a method reference in the foreach loop printing out the elements. The
		 * method references seem to be a little bit faster.
		 */ 
		Comparator<Duck> byWeight = DuckHelper::compareByWeight;
		
		TreeSet<Duck> ducks2 = new TreeSet<>(byWeight);
		
		ducks2.add(huey);
		ducks2.add(dewey);
		ducks2.add(louie);
		ducks2.add(daisy);
		ducks2.add(donald);
		ducks2.add(scrooge);
		
		long start2 = System.currentTimeMillis();
		ducks2.stream().forEach(System.out::println);
		long end2 = System.currentTimeMillis();
		System.out.println(end2 - start2);
	}
}
