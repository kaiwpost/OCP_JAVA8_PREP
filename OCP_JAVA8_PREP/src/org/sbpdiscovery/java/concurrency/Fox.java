package org.sbpdiscovery.java.concurrency;


import java.util.concurrent.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Example of a DEADLOCK, one of three typese of LIVENESS issuses to know for the exam.
 * 
 * In this example both participants are permanently blocked, waiting on resources
 * that will never become available.
 */
public class Fox {

	private static class Food {}
	private static  class Water {}
	
	private void eatAndDrink(Food food, Water water) {
		synchronized(food) {
			System.out.println("Got Food!");
			move();
			synchronized(water) {
				System.out.println("Got Water!");
			}
		}
	}
	
	private void drinkAndEat(Water water, Food food) {
		synchronized(water) {
			System.out.println("Got Water!");
			move();
			synchronized(food) {
				System.out.println("Got Food!");
			}
		}
	}
	
	private void move() {
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		Fox foxy = new Fox();
		Fox tails = new Fox();

		Food food = new Food();
		Water water = new Water();
		
		ExecutorService service = null;
		
		try {
			service = Executors.newScheduledThreadPool(10);
			service.submit(() -> foxy.eatAndDrink(food, water));
			service.submit(() -> tails.drinkAndEat(water, food));
		}
		finally {
			if (service != null) {
				service.shutdown();
			}
		}
	}

}
