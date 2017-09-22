package com.mypackage.core.mkyong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {

		Map<String, Integer> items = getItems();

		// for (Entry<String, Integer> entry : items.entrySet()) {
		// System.out.println(entry.getKey() + " - " + entry.getValue());
		// }

//		items.forEach((k, v) -> System.out.println(k + " = " + v));
		items.forEach((k, v) -> {
			if(k.equals("C"))
				System.out.println(k + " = " + v);
				});
		
		List<String> itemsList = getItemsList();
		
		itemsList.forEach(s -> System.out.println(s));
//		itemsList.forEach(System.out::print);
		itemsList.stream().filter(s -> s.equals("D")).forEach(System.out::println);
	}

	public static Map<String, Integer> getItems() {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		return items;
	}

	public static List<String> getItemsList() {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		return items;
	}

}
