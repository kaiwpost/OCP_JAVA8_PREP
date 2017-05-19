package org.sbpdiscovery.java.enums;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class EnumTest {

	public static void main(String[] args) {
		
		Season s = Season.SUMMER;
		System.out.println(Season.SUMMER);
		System.out.println(s == Season.SUMMER);
		s.printHowItFeels();
		
		System.out.println();
		
		for(Season season : Season.values()) {
			System.out.println(season.name() + "\t" + season.ordinal() + "\t" + season.getDeclaringClass() + "\t" + season.hashCode());
		}
		
		System.out.println();
		
		for(FancySeason fancySeason : FancySeason.values()) {
			fancySeason.printHours();
		}
	}

}
