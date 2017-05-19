package org.sbpdiscovery.java.functionalProgramming;


import java.util.*;
import java.util.stream.Stream;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class StreamImplementations {

	public static Integer getStringLength(String string) {
		return string.length();
	}
	
	public static void main(String[] args) {

		Stream<? extends Object> stream, parallelStream;
		
		stream = Stream.empty();
		
		stream = Stream.of(1);
		
		stream = Stream.of(1, 2, 3);
		
		List<String> list = new LinkedList<>();
		list.add("Kai");
		list.add("Post");
		list.add("super");
		list.add("manly");
		list.add("and");
		list.add("handsome");
		stream = list.stream();
		parallelStream = list.parallelStream(); // This stream is multi-threaded. As a result, items may not necessarily be in order when processing.
		
		//stream = Stream.generate(Math::random);
		//stream = Stream.iterate(1, n -> n + 1);
		//System.out.println(stream.count());
		
		//stream = list.parallelStream();
		
		stream.forEach(System.out::println);
		parallelStream.forEach(System.out::println);	// Not ordered because a parallel streal. Can use forEacOrdered() if ordered access to elements is needed.
		
		list.stream().map(StreamImplementations::getStringLength).forEach(System.out::println);;
	}

}
