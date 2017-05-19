package org.sbpdiscovery.java.generics;


import java.io.FileNotFoundException;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Helper {

	public static <U extends Exception> void printException(U u) {
		System.out.println(u.getMessage());
	}
	
	public static void main(String[] args) {
		// Which of these five statements will allow the class to compile?
		Helper.printException(new FileNotFoundException("A"));
		Helper.printException(new Exception("B"));
		// NO! Helper.<Throwable>printException(new Exception("C"));
		 Helper.<NullPointerException>printException(new NullPointerException("D"));
		// NO! Helper.printException(new Throwable("E"));
	}

}
