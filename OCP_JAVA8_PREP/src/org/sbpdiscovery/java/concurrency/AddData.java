package org.sbpdiscovery.java.concurrency;


import java.util.concurrent.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class AddData {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		
		ExecutorService service = null;
		
		try {
			
			service = Executors.newSingleThreadExecutor();
			
			System.out.println("begin");
		
			Future<Integer> result = service.submit(() -> 30 + 12);

			System.out.println("end");

			System.out.println(result.isDone());
			System.out.println(result.get());		// Will be null for any Runnable, but this is a Callable
		}
		catch(ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			if(service != null) service.shutdown();
		}

	}

}
