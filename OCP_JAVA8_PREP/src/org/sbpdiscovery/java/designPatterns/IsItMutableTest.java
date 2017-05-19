package org.sbpdiscovery.java.designPatterns;

import java.util.ArrayList;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class IsItMutableTest {

	public static void main(String[] args) {

		ArrayList<String>list = new ArrayList<>();
		list.add("Camel");
		list.add("Pooper");
		list.add("Trough");
		
		IsItMutable iim = new IsItMutable(list);
		
		for(String string : iim.getList()) {
			System.out.println(string);
		}
		
		System.out.println();
		
		list.add("Portajohnny");		// Because we still have a reference to the list, we can actually modify the ontents of the object!
		
		for(String string : iim.getList()) {
			System.out.println(string);
		}
	}
}
