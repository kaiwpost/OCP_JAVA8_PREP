package org.sbpdiscovery.java.nestedClasses;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Member Inner Classes: A Member Inner Class is defined at the member level
 * of a class, much like methods, instance variables and constructors.
 */
public class A {
	
	private int x = 25;
	
	class B {
		
		private int x = 125;
		
		class C {
			
			private int x = 625;
			
			public void printTheXes() {
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(B.this.x);
				System.out.println(A.this.x);
			}
		}
	}

	public static void main(String[] args) {
		
		//A a = new A();
		//A.B b = a.new B();
		//A.B.C c = b.new C();
		A.B.C c = new A().new B().new C();
		
		c.printTheXes();
	}
}
