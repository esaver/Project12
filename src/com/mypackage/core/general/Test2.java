package com.mypackage.core.general;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Empty {
}

class Extended extends Empty {
}

public class Test2 {

	public static void doStuff1(List<Empty> list) {
		// some code
	}

	public static void doStuff2(List list) {
		// some code
	}

	public static void doStuff3(List<? extends Empty> list) {
		// some code
	}

	public static void printB(String str) {
		System.out.print(Boolean.valueOf(str) ? "true" : "false");
	}

	public static void main(String args[]) {
		List<Empty> list1 = new LinkedList<Empty>();
		List<Extended> list2 = new LinkedList<Extended>();

		// more code here
		doStuff1(list1);
		doStuff2(list2);
		doStuff2(list1);
		doStuff3(list1);
		doStuff3(list2);
		// doStuff1(list2);

		List list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");

		Collections.reverse(list);
		Iterator iter = list.iterator();

		while (iter.hasNext()) {
			Object object = (Object) iter.next();
			System.out.println(object + " ");
		}
		/*
		 * for (Object o : iter) { System.out.print(o + " "); }
		 */

		printB("tRuE");
		printB("false");

	}

}
