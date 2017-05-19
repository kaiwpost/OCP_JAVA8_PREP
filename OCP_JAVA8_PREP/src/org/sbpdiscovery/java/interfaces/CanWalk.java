package org.sbpdiscovery.java.interfaces;


import static java.lang.System.out;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public interface CanWalk {
	default void walk() { out.println("Walking"); }
}
