package org.sbpdiscovery.java.designPatterns;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class ImmutableStrings {

	public static void main(String[] args) {
		
		String string1, string2;
		
		string1 = "Hello Kitty!";
		string2 = string1;
		System.out.println(string1.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(string1)));
		System.out.println(string1.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(string2)));
		
		string1 = "Bupkas!";
		System.out.println(string1.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(string1)));
	}

}
