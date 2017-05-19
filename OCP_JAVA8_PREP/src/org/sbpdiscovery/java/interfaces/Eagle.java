package org.sbpdiscovery.java.interfaces;

public class Eagle implements Fly {

	@Override
	public int getWingSpan() {			// Overriding abstract method from interface. Since this is a class public needs to be specified. Does not have to throw the exception declared in the interface!
		return 15;
	}
	
	@Override
	public void land() {
		System.out.println("Eagle is diving fast!");
	}
	
	public static void main(String[] args) {
		Eagle eagle  = new Eagle();
		eagle.land();	
	}
}
