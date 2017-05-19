package org.sbpdiscovery.java.nestedClasses;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Anonymous Inner Classes: Anonymous Inner Classes are required to extend
 * an existing class or implement an existing interface. They are useful
 * when you have a short implementation that will not be used anywhere else.
 */
public class AnonInner {

	interface SaleTodayOnly {
		int dollarsOff();
	}
	
	public int admission(int basePrice) {
		
		SaleTodayOnly sale = new SaleTodayOnly() {
			public int dollarsOff() { return 3; }	// Public because interfaces require all method declarations to be public!!!
		};
		
		return basePrice = basePrice - sale.dollarsOff();
	}
	
	public static void main(String[] args) {
		
		AnonInner ai = new AnonInner();
		int finalPrice = ai.admission(50);
		
		System.out.println(finalPrice);
	}

}
