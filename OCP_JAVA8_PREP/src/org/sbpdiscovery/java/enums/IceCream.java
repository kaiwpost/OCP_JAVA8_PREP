package org.sbpdiscovery.java.enums;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * To illustrate that in enums you refer to the enum itself (STRAWBERRY),
 * not by the ordinal (case 2:), which will not compile.
 */
public class IceCream {

	enum Flavors {
		VANILLA, CHOCOLATE, STRAWBERRY;
	}
	
	
	public static void main(String[] args) {
		
		Flavors f = Flavors.STRAWBERRY;
		switch(f) {
			case VANILLA: System.out.println("VANILLA");
			case CHOCOLATE: System.out.println("CHOCOLATE");
			case STRAWBERRY: System.out.println("STRAWBERRY");
		}
	}

}
