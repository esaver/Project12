package com.mypackage.core;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFilterTest {
	
	public static void main(String[] args) {
			List<String> list = Arrays.asList("spring", "node", "mkyong");
			
			String result = list.stream()
//					.filter(s -> !s.equals("mkyong"))
					.filter(s -> s.startsWith("m"))
					.findFirst()
//					.findAny()
					.orElse("default");
			
			System.out.println(result);
			
//					.collect(Collectors.toList());
			
	}
}
