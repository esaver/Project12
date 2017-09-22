package com.mypackage.core.mkyong;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {
	
	public static void main(String[] args) {
		
		List<Developer> developers = getDevelopers();
		
		for (Developer developer : developers) {
			System.out.println(developer);
		}
		
		/*Collections.sort(developers, new Comparator<Developer>() {

			@Override
			public int compare(Developer o1, Developer o2) {
//				return o1.getName().compareTo(o2.getName());
				return o1.getAge() - o2.getAge();
			}
		});*/
		
//		developers.sort((Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName()));
//		developers.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		Comparator<Developer> nameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Comparator<Developer> byAge = (o1, o2) -> o1.getAge() - o2.getAge();
		Comparator<Developer> bySalary = (o1, o2) -> o1.getSalary().compareTo(o2.getSalary());
//		developers.sort(nameComparator.reversed());
//		developers.sort(nameComparator.thenComparing(ageComparator));
//		developers.sort(nameComparator.thenComparingInt(d -> d.getAge()).reversed());
		
		Comparator<Developer> byName = Comparator.comparing(
			                  Developer::getName,
			                  String.CASE_INSENSITIVE_ORDER);
		developers.sort(byName.thenComparing(byAge).thenComparing(bySalary).reversed());
		
//		Comparator<Developer> cmpSalary = Comparator.comparing(
//                Developer::getSalary,
//                salaryComparator);
//		developers.sort(cmpSalary);
		
		System.out.println("----- After Sorting -----");
		for (Developer developer : developers) {
			System.out.println(developer);
		}
	}
	
	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		result.add(new Developer("iris", new BigDecimal("280000"), 44));

		return result;

	}

}
