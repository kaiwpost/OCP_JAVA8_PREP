package org.sbpdiscovery.java.lambdaExpressions;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class FindMatchingAnimals {

	private static void print(Animal animal, CheckTrait trait) {
		if(trait.test(animal)) {
			System.out.println(animal);
		}
	}
	
	public static void main(String[] args) {
		print(new Animal("fish", false, true), (Animal a) -> { return a.canHop(); } );	// Long form of lambda expression.
		print(new Animal("kangaroo", true, false), (Animal a) -> a.canHop());			// Shorter form of lambda expression.
		print(new Animal("penguin", true, true), a -> { return a.canHop(); } );			// Shorter form of lambda expression.				
		print(new Animal("penguin", true, true), a -> a.canSwim());						// Shortest form of lambda expression.
	}

}
