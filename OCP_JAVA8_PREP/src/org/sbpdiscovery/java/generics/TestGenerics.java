package org.sbpdiscovery.java.generics;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
import java.util.*;

public class TestGenerics {

	private static Integer iOne = new Integer(1);
	private static Integer iFive = new Integer(5);

	private static Number nTwoPointFive = new Double(2.5);
	private static Number nFour = new Integer(4);

	private static List<Integer> integers = new ArrayList<>();
	private static List<? extends Number> numbers1 = new ArrayList<Integer>();
	private static List<? super Number> numbers2 = new ArrayList<Number>();
	private static List<Number> numbers3 = new ArrayList<Number>();

	public static void main(String[] args) {

		integers.add(iOne);
		integers.add(iFive);

		System.out.println(integers);

		//numbers1.add(nFour);
		System.out.println(numbers1);

		numbers2.add(iOne);
		numbers2.add(iFive);
		numbers2.add(nTwoPointFive);
		numbers2.add(nFour);

		System.out.println(numbers2);

		numbers3.add(iOne);
		numbers3.add(iFive);
		numbers3.add(nTwoPointFive);
		numbers3.add(nFour);

		System.out.println(numbers3);
	}
}
