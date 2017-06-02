package org.sanfordburnham.java.memoryManagement;


import java.lang.ref.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 * 
 * Regular references to Java objects are referred to as strong references.
 * 
 * Weak references can be created using the WeakReference container and obtained using
 * its get() method. Unlike strong references, weak references are eagerly garbage
 * collected and used mostly for caching.
 * 
 * Soft references can be created using the SoftReference container and obtained using
 * its get() method. Unlike strong references, soft references are eagerly garbage
 * collected and used mostly for caching. Unlike weak references they are usually only
 * garbage collected once heap memory is completely filled.
 */
public class TestReferenceTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		
		String strongReference = new String("Strong Reference");
		WeakReference<String> weakReference = new WeakReference<>("Weak Reference");
		SoftReference<String> softReference = new SoftReference<>("Soft Reference");
		
		String string = weakReference.get();
		
		while(string != null) {
			System.out.println("Holding on to the weak reference!");
			Thread.sleep(1000);
		}
		
		System.out.println("Lost weak reference!");
	}

}
