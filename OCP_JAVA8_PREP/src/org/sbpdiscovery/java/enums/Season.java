package org.sbpdiscovery.java.enums;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public enum Season {
	
	WINTER("cold"), SPRING("colorful"), SUMMER("hot"), FALL("sweet");
	
	private String howItFeels;
	
	private Season(String howItFeels) {
		this.howItFeels = howItFeels;
	}
	
	public void printHowItFeels() {
		System.out.println(howItFeels);
	}
}
