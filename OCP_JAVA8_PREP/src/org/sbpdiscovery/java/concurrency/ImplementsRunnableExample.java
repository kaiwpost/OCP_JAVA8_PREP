package org.sbpdiscovery.java.concurrency;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class ImplementsRunnableExample implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("Printing recors: " + i);
		}
	}
	
	public static void main(String[] args) {
		new Thread(new ImplementsRunnableExample()).start();
	}
}
