package org.sbpdiscovery.java.enums;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public enum FancySeason {

	WINTER { public void printHours() { System.out.println("9:00 am - 3:00 pm"); } }, SPRING, 
	//SPRING { public void printHours() { System.out.println("9:00 am - 5:00 pm"); } },
	SUMMER { public void printHours() { System.out.println("9:00 am - 7:00 pm"); } }, FALL;
	//FALL { public void printHours() { System.out.println("9:00 am - 5:00 pm"); } };
	
	//public abstract void printHours();
	public void printHours() { System.out.println("9:00 am - 5:00 pm"); }
}
