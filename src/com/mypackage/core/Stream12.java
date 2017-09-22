package com.mypackage.core;

import java.util.stream.Stream;

public class Stream12 {
	
	public static void main(String[] args) {
		/*Stream.generate(() -> "Elsa")
		.filter(n -> n.length() == 4)
		.sorted()
		.limit(2)
		.forEach(System.out::println);*/
		//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		//at java.util.Arrays.copyOf(Arrays.java:3210)
		
		Stream.generate(() -> "Elsa")
		.filter(n -> n.length() == 4)
		.limit(2)
		.sorted()
		.forEach(System.out::println); // Elsa Elsa
		
		Stream.generate(() -> "Elsa Second")
		.filter(n -> n.length() == 4)
		.limit(2)
		.sorted()
		.forEach(System.out::println);
		//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		//at java.util.Arrays.copyOf(Arrays.java:3210)
	}

}
