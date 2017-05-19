package org.sbpdiscovery.java.lambdaExpressions;


import java.util.function.Predicate;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Using the generic Predicate<T> interface with lambda expressions.
 */
public class FindMatchingAnimalsWithPredicate {

	private static void print(Animal animal, Predicate<Animal> trait) {
		if(trait.test(animal)) {
			System.out.println(animal);
		}
	}

	public static void main(String[] args) {
		print(new Animal("fish", false, true), (Animal a) -> { return a.canHop(); } );
		print(new Animal("kangaroo", true, false), (Animal a) -> a.canHop());
		print(new Animal("penguin", true, true), a -> { return a.canHop(); } );				
		print(new Animal("penguin", true, true), a -> a.canSwim());
	}

}
