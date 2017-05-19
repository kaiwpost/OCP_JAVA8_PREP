package org.sbpdiscovery.java.collections;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Using the Comparable and Comparator interfaces for sorting collections
 * of objects.
 */
public class Animal implements Comparable<Animal> {

	private int id;
	private String name;
	
	public Animal(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Animal animal) {
		return this.id - animal.id;
	}
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
		Animal a1 = new Animal(1, "Tasmanian Devil");
		Animal a2 = new Animal(5, "Parrot");
		Animal a3 = new Animal(2, "Aligator");
		
		List<Animal> animals = new ArrayList<>();
		animals.add(a1);
		animals.add(a2);
		animals.add(a3);
		
		// Implementing the interface the classic way:
		Comparator<Animal> byName =
			new Comparator<Animal>() {
				public int compare(Animal animal1, Animal animal2) {
					return animal1.name.compareTo(animal2.name);
				}
			};
			
		// Implementing the (functional) interface with a lambda expression:
		Comparator<Animal> byNameLambda =
			(animal1, animal2) -> animal1.name.compareTo(animal2.name);
			
		Collections.sort(animals, byName);			// Comparator (classic)
		System.out.println(animals);
		
		Collections.sort(animals);					// Comparable
		System.out.println(animals);
		
		Collections.sort(animals, byNameLambda);	// Comparoator (lambda)
		System.out.println(animals);
	}
}
