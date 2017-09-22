package com.mypackage.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapTest {
	
	public static void main(String[] args) {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		
		List<String> list = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}
