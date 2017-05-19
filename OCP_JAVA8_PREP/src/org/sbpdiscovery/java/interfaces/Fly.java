package org.sbpdiscovery.java.interfaces;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
@FunctionalInterface									// Interfaces with one single abstract method declaration are automatically considered functional interfaces.
public interface Fly {

	public static final int MAX_SPEED = 100;			// "public static final" would be added automatically because it's an interface.
	
	public abstract int getWingSpan() throws Exception;	// "public abstract" would be added automatically because it's an interface.
	
	public default void land() {						// Default method. Public would be added automatically, but default has to be explicitly defined!
		System.out.println("Animal is landing!");
	}
	
	public static double calculateSpeed(float distance, double time) {	// Static method. Public would be added automatically, but static has to be explicitly defined!
		return distance / time;
	}
}
