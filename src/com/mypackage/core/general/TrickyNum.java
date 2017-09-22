package com.mypackage.core.general;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TrickyNum<X extends Number> {

	private X x;

	public TrickyNum(X x) {
		this.x = x;
	}

	private double getDouble() {
		return x.doubleValue();
	}

	public static void main(String args[]) {
		TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
		System.out.print(a.getDouble());

		Queue<String> q = new PriorityQueue<String>();
		q.add("3");
		q.add("1");
		q.add("2");
		System.out.print(q.poll() + " ");
		System.out.print(q.peek() + " ");
		System.out.println(q.peek());

		LinkedList<String> list = new LinkedList<String>();
		list.add("BbB1");
		list.add("bBb2");
		list.add("bbB3");
		list.add("BBb4");
		Collections.sort(list);
		for (String str : list) {
			System.out.print(str + ":");
		}
	}
}