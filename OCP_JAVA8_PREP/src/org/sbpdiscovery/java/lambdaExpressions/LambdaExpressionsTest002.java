package org.sbpdiscovery.java.lambdaExpressions;



public class LambdaExpressionsTest002 {

	public static void main(String[] args) {
		System.out.println(convert(100, (x) -> String.valueOf(x)));
		System.out.println(convert(100, String::valueOf));
		System.out.println(convert(100, (x) -> (x + 99) + ""));
	}
	
	@FunctionalInterface
	interface Conversion {
		String convert(Integer number);
	}
	
	public static String convert(Integer number, Conversion function) {
		return function.convert(number);
	}

}
