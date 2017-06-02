package org.sbpdiscovery.java.collections;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Stacks store elements in a Last in, first out (LIFO) order using push/pop.
 * Queues hold items in a first in, first out (FIFO) order using add/remove.
 * Deques are double-ended queues and able to do both.
 */
public class StackQueueDequeTesting {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		Deque<Integer> deque1 = new ArrayDeque<>();
		Deque<Integer> deque2 = new ArrayDeque<>();
		
		System.out.println("Stack");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		
		System.out.println("Queue");
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println();
		
		System.out.println("Deque 1");
		deque1.add(1);
		deque1.add(2);
		deque1.add(3);
		deque1.add(4);
		System.out.println(deque1.remove());
		System.out.println(deque1.remove());
		System.out.println();
		
		System.out.println("Deque 2");
		deque2.push(1);
		deque2.push(2);
		deque2.push(3);
		deque2.push(4);
		System.out.println(deque2.pop());
		System.out.println(deque2.pop());
		System.out.println();
	}

}
