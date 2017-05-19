package org.sbpdiscovery.java.generics;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Hello<T> {
	
	T t;
	
	public Hello(T t) {
		this.t = t;
	}
	
	@Override
	public String toString() {
		return t.toString();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.print(new Hello<String>("hi"));
		System.out.print(new Hello("there"));
	}
}
