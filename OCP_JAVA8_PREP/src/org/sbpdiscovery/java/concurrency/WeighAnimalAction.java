package org.sbpdiscovery.java.concurrency;


import java.util.*;
import java.util.concurrent.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Example of applying the Fork/Join framework.
 */
public class WeighAnimalAction extends RecursiveAction {

	private static final long serialVersionUID = 1L;
	
	private Double[] weights;
	private int start;
	private int end;
	
	public WeighAnimalAction(Double[] weights, int start, int end) {
		
		this.weights = weights;
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {

		if((end - start) <= 3) {
			for(int i = start; i < end; i++) {
				weights[i] = (double) new Random().nextInt(100);
				System.out.println("Animal Weighed: " + i);
			}
		}
		else {
			int middle = start + ((end - start) / 2);
			System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
			invokeAll(
				new WeighAnimalAction(weights, start, middle),
				new WeighAnimalAction(weights, middle, end));
		}
	}
	
	public static void main(String[] args) {

		Double[] weights = new Double[10];
		
		ForkJoinTask<?> task = new WeighAnimalAction(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
		
		System.out.println();
		System.out.print("Weights: ");
		Arrays.asList(weights).stream().forEach((a) -> System.out.print(a.intValue() + "\t"));
	}
	
}
