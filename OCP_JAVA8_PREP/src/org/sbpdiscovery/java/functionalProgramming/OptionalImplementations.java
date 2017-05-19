package org.sbpdiscovery.java.functionalProgramming;


import java.util.Optional;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class OptionalImplementations {

	public static Optional<Double> average(int... scores) {

		int sum = 0;
		for(int score : scores) sum += score;
		
		if(scores.length > 0)
			return Optional.of((double) sum / scores.length);
		else
			return Optional.empty();
	}
	
	public static void main(String[] args) {
		
		average().ifPresent(System.out::println);
		average(1).ifPresent(System.out::println);
		average(3, 6, 9).ifPresent(System.out::println);
		average().orElseThrow(IllegalStateException::new);
	}
}
