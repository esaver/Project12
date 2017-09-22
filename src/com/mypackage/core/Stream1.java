package com.mypackage.core;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream1 {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("monkey", "2", "chimp" );
		Stream<String> infinite =  Stream.generate(() -> "chimp");
		Predicate<String> pred =  x -> Character.isLetter(x.charAt(0));
		System.out.println(list.stream().anyMatch(pred));
		System.out.println(list.stream().allMatch(pred));
		System.out.println(list.stream().noneMatch(pred));
//		System.out.println(infinite.noneMatch(pred));
//		System.out.println(infinite.anyMatch(pred));
//		System.out.println(infinite.allMatch(pred)); //infinite loop, kill program to terminate
//		infinite.forEach(System.out::println);// infinite chimp output
		
		Stream<Integer> stream = Stream.of(3,5,6);
		System.out.println(stream.reduce(1, (a,b) -> a*b));
		
		Stream<Integer> s =  Stream.iterate(1, n -> n + 1);
		s.skip(5).limit(2).forEach(System.out::println);
		
		Stream<String> s2 = Stream.of("monkey","gorilla","bonobo");
//		s2.map(x -> x.length()).forEach(System.out::println); // using lambda 
		s2.map(String::length).forEach(System.out::println); // using method reference
		
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		
		Stream<List<String>> animals = Stream.of(zero, one, two);
//		animals.flatMap(l -> l.stream()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		animals.flatMap(l -> l.stream()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
	}

}
