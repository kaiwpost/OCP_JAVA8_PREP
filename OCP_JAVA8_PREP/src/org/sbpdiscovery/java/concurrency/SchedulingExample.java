package org.sbpdiscovery.java.concurrency;

import java.util.concurrent.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class SchedulingExample {

	public static void main(String[] args) {
		
		ScheduledExecutorService service =
			Executors.newSingleThreadScheduledExecutor();
		
		Runnable task1 = () -> System.out.println("Hello, children!");
		Callable<String> task2 = () -> { System.out.println("What's up with monkeys?"); return "Monkeys are fun!"; };
		
		service.schedule(task1, 1, TimeUnit.MINUTES);
		service.schedule(task2, 20, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(task1, 15L, 4L, TimeUnit.SECONDS);
	}

}
