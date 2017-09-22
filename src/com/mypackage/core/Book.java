package com.mypackage.core;

public class Book implements Comparable {
	
	String title;
	public Book(String t){
		this.title = t;
	}
	
	@Override
	public int compareTo(Object b) {
		Book book = (Book)b;
		return this.title.compareTo(book.title);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
}
