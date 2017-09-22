package com.mypackage.core;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Test11 {

	public static void main(String[] args) {
		
		//Supplier
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1);
		System.out.println(d2);
		
		//Cosumer
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		
		c1.accept("Amit");
		c2.accept("Amit");
		
		//BiConsumer
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k,v) -> map.put(k,v);
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		
		System.out.println(map);
		
		Predicate<List> ex1 = x -> "".equals(x.get(0));
		System.out.println(ex1.test(Arrays.asList("")));
		
		Consumer<Long> ex2 = (Long l) -> System.out.println(l);
		ex2.accept(25l);
		
		BiPredicate<String, String> ex3 = (s3, s4) -> false;
		System.out.println(ex3.test("A", "B"));
		
		Function<List<String>, String> exx1 = x -> x.get(0);
//		UnaryOperator<Lo ng> exx2 = (Long l) -> 3.14l;
		Predicate<String> exx4 = String::isEmpty;
		
//		Queue<Integer> q = new LinkedList<>();
//		q.add(10);
//		q.add(12);
//		q.remove(1);
//		System.out.println(q);
//
//		Map<Integer, Integer> m = new HashMap();
//		m.put(1, 10);
//		m.put(2, 20);
//		m.put(3, null);
//		m.merge(1, 3, (a,b)->a+b);
//		m.merge(3, 3, (a,b)->a+b);
//		
//		System.out.println(m);
	}

}

