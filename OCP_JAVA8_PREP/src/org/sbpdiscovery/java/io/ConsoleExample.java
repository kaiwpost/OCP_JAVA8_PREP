package org.sbpdiscovery.java.io;


import java.io.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Unfortunately, Console is run as a background process in Eclipse.
 */
public class ConsoleExample {

	private Integer age;
	
	{ age = 10; }
	
	public static void main(String[] args) throws IOException {
		
		Console console = System.console();
		
		if(console != null) {
			String userInput = console.readLine();
			console.writer().println("You have entered: " + userInput);
		}
		
		ConsoleExample ce = new ConsoleExample();
		System.out.println(ce.age);
	}
}
