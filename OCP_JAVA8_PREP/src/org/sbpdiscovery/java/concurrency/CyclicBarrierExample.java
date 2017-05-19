package org.sbpdiscovery.java.concurrency;


import java.util.concurrent.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Demonstration of the CyclicBarrier class.
 */
public class CyclicBarrierExample {

	private void removeLions(String identifier) { System.out.println("Removing the lions! " + identifier); }
	private void cleanPen(String identifier) { System.out.println("Cleaning the pen! " + identifier); }
	private void returnLions(String identifier) { System.out.println("Returning the lions! " + identifier); }
	
	public void performTask(CyclicBarrier c1, CyclicBarrier c2, String identifier) {

		try {
			
			removeLions(identifier);
			c1.await();
			cleanPen(identifier);
			c2.await();
			returnLions(identifier);
		}
		catch(InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ExecutorService service = null;
		
		try {
			
			service = Executors.newFixedThreadPool(4);
			
			CyclicBarrierExample manager = new CyclicBarrierExample();
			CyclicBarrier c1 = new CyclicBarrier(4);
			CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen cleaned!"));
			
			for(int i = 0; i < 4; i++) {
				String localIdentifier = "(" + i + ")";
				service.submit(() -> manager.performTask(c1, c2, localIdentifier));
			}
		}
		finally {
			
			if(service != null) {
				service.shutdown();
			}
		}
	}
}
