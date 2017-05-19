package org.sbpdiscovery.java.basics;


import java.util.ArrayList;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class IsItFurry {
	
	static class Chipmunk {}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Chipmunk c = new Chipmunk();
		ArrayList<Chipmunk> l = new ArrayList<Chipmunk>();
		Runnable r = new Thread();
		
		int result = 0;
		
		if(c instanceof Chipmunk) result += 1;
		//if(l instanceof Chipmunk) result += 2;	// Compiler error. Why?
		if(r instanceof Chipmunk) result += 4;
		
		System.out.println(result);
	}
}
