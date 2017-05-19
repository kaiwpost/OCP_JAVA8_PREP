package org.sbpdiscovery.java.nestedClasses;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Member Inner Classes: A Member Inner Class is defined at the member level
 * of a class, much like methods, instance variables and constructors.
 * 
 * Local Inner Classes: A Local Inner Class is a nested class defined within
 * a method. Like local variables, a local inner class declaration does not
 * exist until the method is invoked, and it goes out of scope once the
 * method returns.
 */
public class Outer {

	/*
	private static String message = "We're on message!";
	
	protected class Inner extends Outer {
		@Override
		public void go() {
			System.out.println("From Inner: " + message);
		}
	}
	
	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}
	
	protected void go() {
		System.out.println("From Outer: " + message);
	}
	*/
	
	private int length = 5;
	
	public void calculate() {
		
		final int width = 20;
		
		class Inner {
			public void multiply() {
				System.out.println(length * width);
			}
		}
		
		Inner inner = new Inner();
		inner.multiply();
	}
	
	public static void main(String[] args) {
		
		/*
		Outer outer = new Outer();
		outer.go();
		outer.callInner();
		
		Inner inner = outer.new Inner();
		inner.go();
		*/
		
		Outer outer = new Outer();
		outer.calculate();
	}
}
