package org.sbpdiscovery.java.lambdaExpressions;


public class LambdaExpressionsTest001 {

	public static void main(String[] args) {
		
		Lambda1 l1A = (Integer one, Integer two) -> { return one + two; };
		Lambda1 l1B = (one, two) -> { return one + two; };
		Lambda1 l1C = (one, two) -> one + two;
		
		Lambda2 l2A = (Integer one) -> { return one + 34; };
		Lambda2 l2B = (one) -> { return one + 34; };
		Lambda2 l2C = one -> one + 34;
		
		Lambda3 l3A = () -> { return 22; };
		Lambda3 l3B = () -> 22;
		
		System.out.println(l1A.compute(3, 5));
		System.out.println(l1B.compute(3, 5));
		System.out.println(l1C.compute(3, 5));
		
		System.out.println(l2A.compute(5));
		System.out.println(l2B.compute(5));
		System.out.println(l2C.compute(5));
		
		System.out.println(l3A.compute());
		System.out.println(l3B.compute());
	}
	
	@FunctionalInterface
	interface Lambda1 {
		Integer compute(Integer one, Integer two);
		public String toString();
	}

	@FunctionalInterface
	interface Lambda2 {
		Integer compute(Integer one);
	} 
	
	@FunctionalInterface
	interface Lambda3{
		Integer compute();
	}
}


