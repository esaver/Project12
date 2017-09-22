package com.mypackage.core;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.toLowerCase().compareTo(o1.toLowerCase());
	}
	
	public static void main(String[] args) {
		String[] values ={"123", "Abb", "abb"};
		Arrays.sort(values, new MyComparator());
		for (String string : values) {
			System.out.println(string + " ");
		}
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for (int i = 1; i <= 10; i++) {
			map.put(i, i*i);
		}
		
		System.out.println(map.get(4));
	}

}
