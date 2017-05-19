package org.sbpdiscovery.java.concurrency;


import java.util.concurrent.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class ZooInfo {
	
	public static void main(String[] args) {
		
		ExecutorService service = null;
		
		try {
			
			service = Executors.newSingleThreadExecutor();
			
			System.out.println("begin");
		
			Future<?> result1 = service.submit(() -> System.out.println("Printing zoo inventory"));
			
			Future<?> result2 = service.submit(() -> {
				for(int i = 0; i < 3; i++) {
					System.out.println("Printing record " + i);
				}
			});
			
			Future<?> result3 = service.submit(() -> System.out.println("Printing zoo inventory"));
			
			System.out.println("end");
			
			System.out.println(result1.isDone());
			System.out.println(result2.isDone());
			System.out.println(result3.get());		// Will be null for any Runnable
		}
		catch(ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			if(service != null) service.shutdown();
		}
	}

}
