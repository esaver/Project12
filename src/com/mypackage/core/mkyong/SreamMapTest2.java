package com.mypackage.core.mkyong;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SreamMapTest2 {

	public static void main(String[] args) {
		List<Developer> devs = Arrays.asList(new Developer("mkyong", new BigDecimal(10000), 30),
				new Developer("jack", new BigDecimal(20000), 27), new Developer("jack", new BigDecimal(28000), 31),
				new Developer("lawrence", new BigDecimal(30000), 33));

		Set<String> set = devs.stream().map(d -> d.getName()).collect(Collectors.toSet());
		set.forEach(System.out::println);

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		Map<String, Long> result = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);
		
		Map<String, Long> finalMap = new LinkedHashMap<>();
		
//		result.entrySet().stream().
		

	}

}
