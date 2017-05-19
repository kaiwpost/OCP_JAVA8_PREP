package org.sbpdiscovery.java.collections;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Sorted implements Comparable<Sorted>, Comparator<Sorted> {

	private int num;
	private String text;
	
	public Sorted(int num, String text) {
		super();
		this.num = num;
		this.text = text;
	}

	@Override
	public int compare(Sorted s1, Sorted s2) {
		return s1.num - s2.num;
	}

	@Override
	public int compareTo(Sorted s) {
		return text.compareTo(s.text);
	}
	
	@Override
	public String toString() {
		return "" + num;
	}
	
	public static void main(String[] args) {

		Sorted s1 = new Sorted(88, "a");
		Sorted s2 = new Sorted(55, "b");

		TreeSet<Sorted> t1 = new TreeSet<>();
		t1.add(s1);
		t1.add(s2);
		
		System.out.println(t1);
		
		TreeSet<Sorted> t2 = new TreeSet<>(s1);
		t2.add(s1);
		t2.add(s2);
		
		System.out.println(t2);
		
		System.out.println(t1 + " " + t2);
	}
}
