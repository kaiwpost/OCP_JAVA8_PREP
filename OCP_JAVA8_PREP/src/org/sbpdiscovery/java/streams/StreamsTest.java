package org.sbpdiscovery.java.streams;


import java.util.stream.Stream;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class StreamsTest {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("Tobovski", "Merilee", "Kai");
		stream.forEach(System.out::println);
	}

}
