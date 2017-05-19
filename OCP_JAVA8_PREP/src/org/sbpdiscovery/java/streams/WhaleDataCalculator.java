package org.sbpdiscovery.java.streams;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class WhaleDataCalculator {

	public int processRecord(int input) {
		
		try {
			Thread.sleep(4);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		return input + 1;
	}
	
	public void processAllData(List<Integer> data) {
		data.parallelStream().map(this::processRecord).count();
	}
	
	public static void main(String[] args) {
		
		WhaleDataCalculator calculator = new WhaleDataCalculator();
		
		// Define the data.
		List<Integer> data = new ArrayList<>();
		for(int i = 0; i < 4000; i++) data.add(i);
		
		// Process the data.
		long start = System.currentTimeMillis();
		calculator.processAllData(data);
		double time = (System.currentTimeMillis() - start) / 1000.0;
		
		//Report results.
		System.out.println("Tasks completed in: " + time + " seconds.");

	}
}
