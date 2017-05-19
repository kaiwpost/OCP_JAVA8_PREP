package org.sbpdiscovery.java.nestedClasses;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Java 8 introduced the concept of "effectively final". Before that,
 * final variables had to be explicitly declared as such. Now, if the
 * code still compiles with the "final" keyword inserted before a local
 * variable the variable is considered effectively final.
 */
public class IsItFinal {

	@SuppressWarnings("unused")
	public void isItFinal() {
		final int one = 20;		// one is assigned only once -> effectively final
		int two = one;			// two is assigne more than once -> NOT effectively final
		two++;
		final int three;		// three is assigned only once (in either branch of if/else -> effectively final
		if(one == 4) three = 3;
		else three = 4;
		int four = 4;			// four is assigned more than once -> NOT effecively final (It doesn't matter that the second assignment happens after the local inner class declaration.)
		class Inner{}
		four = 5;
	}
	
	public static void main(String[] args) {
		
		IsItFinal isItFinal = new IsItFinal();
		isItFinal.isItFinal();
	}
}
