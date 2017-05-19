package org.sbpdiscovery.java.imports;


import static java.util.Collections.*;

import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class ImportTest {

	public static List<String> copyAndSortList(List<String> originalList) {
		List<String> newList = new ArrayList<String>(originalList);
		sort(newList);
		return newList;
	}
	
	public static void main(String[] args) {
		
		List<String> testList = new ArrayList<String>();
		testList.add("Zoology");
		testList.add("Botany");
		testList.add("Entomology");
		
		testList = copyAndSortList(testList);
		
		for(String subject : testList) {
			System.out.println(subject);
		}
	}
}
