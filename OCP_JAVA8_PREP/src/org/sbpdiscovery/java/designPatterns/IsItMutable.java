package org.sbpdiscovery.java.designPatterns;


import java.util.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class IsItMutable {

	private List<String> list;
	
	public IsItMutable(List<String> list) {
		this.list = new ArrayList<>(list);					// Creation of a new object will prevent the original object to be modified in the creating class!
	}
	
	public List<String> getList() {	
		return Collections.unmodifiableList(this.list);		// collections.unmodefiableList will ensure that the list will not be modified.
	}
}
