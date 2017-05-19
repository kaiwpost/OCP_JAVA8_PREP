package org.sbpdiscovery.java.generics;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Generic2<T> {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Generic2<String> g1 = new Generic2<>();
		Generic2<Object> g2 = new Generic2();
	}
}
