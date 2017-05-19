package org.sbpdiscovery.java.basics;


/**
 * Copyright Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class OperatorsDemonstration {

	public static void main(String[] args) {
		
		int x = 4;
		
		/**
		 * Postfix Operators
		 */
		System.out.println("Postfix Operators");
		System.out.println(x++);
		System.out.println(x--);
		System.out.println(x);
		
		/**
		 * Unary Operators
		 */
		System.out.println("Unary Operators");
		System.out.println(++x);
		System.out.println(--x);
		System.out.println(+x);
		System.out.println(-x);
		System.out.println(~0);	// Inverts bit pattern, i.e. 0000 to 1111
		System.out.println(!true);
		
		/**
		 * Multiplicative Operators
		 */
		System.out.println("Multiplicative Operators");
		System.out.println(3*4);
		System.out.println(144/12);
		System.out.println(9%4);
		
		/**
		 * Additive Operators
		 */
		System.out.println("Additive Operators");
		System.out.println(3+4);
		System.out.println(144-12);

		/**
		 * Shift Operators
		 */
		System.out.println("Shift Operators");
		int a = 60;	/* 60 = 0011 1100 */
		int b = 13;	/* 13 = 0000 1101 */
		int c = 0;

		c = a & b;        /* 12 = 0000 1100 */
		System.out.println("a & b = " + c );

		c = a | b;        /* 61 = 0011 1101 */
		System.out.println("a | b = " + c );

		c = a ^ b;        /* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c );

		c = ~a;           /*-61 = 1100 0011 */
		System.out.println("~a = " + c );

		c = a << 2;       /* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c );

		c = a >> 2;       /* 15 = 1111 */
		System.out.println("a >> 2  = " + c );

		c = a >>> 2;      /* 15 = 0000 1111 */
		System.out.println("a >>> 2 = " + c );
		
		System.out.println(true ^ true);
		System.out.println(true | true);
		System.out.println(false || true);
	}
}
