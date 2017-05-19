package org.sbpdiscovery.java.basics;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Playing with equals.
 */
public class Canada {

	public static void main(String[] args) {
		
		String s1 = "Canada";
		String s2 = new String(s1);
		
		if(s1 == s2) System.out.println("s1 == s2");
		if(s1.equals(s2)) System.out.println("s1.equals(s2)");
	}
}
