package org.sbpdiscovery.java.interfaces;


import static java.lang.System.out;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public interface CanRun {
	public default void walk() { out.println("Walking"); }
	public abstract void run();
}

