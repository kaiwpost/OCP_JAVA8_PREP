package org.sbpdiscovery.java.lambdaExpressions;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Climber {
	
	@SuppressWarnings("unused")
	private static void check(Climb climb, int height) {
		if(climb.isTooHigh(height, 10))
			System.out.println("Too high!");
		else
			System.out.println("It's OK!");
	}
	
	public static void main(String[] args) {
		//check((h, l) -> h, 5);
	}

}
