package org.sbpdiscovery.java.concurrency;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class ExtendsThreadExample extends Thread {

	@Override
	public void run() {
		System.out.println("Printing inventory ...");
	}
	
	public static void main(String[] args) {
		new ExtendsThreadExample().start();
	}

}
