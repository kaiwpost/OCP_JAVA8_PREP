package org.sbpdiscovery.java.basics;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class AddWithoutArithmeticOperators {

	static int add(int a, int b) {

		while(b != 0) {
			int sumWithoutCarry = a ^ b;
			int carryWithoutAdd = (a & b) << 1;
			a = sumWithoutCarry;
			b = carryWithoutAdd;
		}
		
		return a;
	}
	
	public static void main(String[] args) {

		System.out.println(add(4, 4));
		System.out.println(5 ^ 2);
		System.out.println(2 ^ 5);
	}
}
