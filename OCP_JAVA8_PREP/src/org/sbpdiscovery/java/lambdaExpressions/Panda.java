package org.sbpdiscovery.java.lambdaExpressions;


import java.util.function.Predicate;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Panda {

	int age;
	
	private static void check(Panda panda, Predicate<Panda> predicate) {
		String result = predicate.test(panda) ? "match" : "no match";
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Panda p1 = new Panda();
		p1.age = 1;
		check(p1, p -> p.age < 5);
	}

}
