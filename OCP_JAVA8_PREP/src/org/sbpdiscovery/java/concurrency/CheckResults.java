package org.sbpdiscovery.java.concurrency;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Example of polling with sleep.
 */
public class CheckResults {

	private static int counter = 0;
	
	public static void main(String[] args) throws InterruptedException {

		new Thread(() -> { for(int i = 0; i < 500000; i++){ CheckResults.counter++; }}).start();
		
		while(CheckResults.counter < 100000) {
			System.out.println("Not reached yet!");
			Thread.sleep(100);	// Frees up resources for other threads in the meantime. Without it it would just keep performing unnecessary tasks.
		}
		
		System.out.println("Reached!");
	}

}
