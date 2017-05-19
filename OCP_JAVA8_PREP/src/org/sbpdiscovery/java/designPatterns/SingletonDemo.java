package org.sbpdiscovery.java.designPatterns;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class SingletonDemo {

	private static volatile String instance;
	
	public static String getInstance() {	// Double-checked locking pattern creates lock only if the singleton has not been created yet. 
		if(instance == null) {
			synchronized(String.class) {
				instance = "Poodle";
			}
		}
		
		return instance;
	}
	
	
	public static void main(String[] args) {

	}
}
