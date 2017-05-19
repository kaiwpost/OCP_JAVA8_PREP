package org.sbpdiscovery.java.properties;


import java.util.Properties;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class PropertiesTest {

	public static void main(String[] args) {

		Properties properties = System.getProperties();
		properties.list(System.out);
	}
}
