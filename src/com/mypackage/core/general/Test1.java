package com.mypackage.core.general;

import java.io.IOException;

public class Test1 /*implements Foo */{
	
	public static void main(String[] args) {
		/*Super s = new Subclass();
		s.foo();
		
		Subclass s1 = new Subclass();
		s1.foo();*/
		/*Foo.x = 20;
		System.out.println(Foo.x);*/
		
		char c = 65;
		System.out.println("c = "+c);
		
	/*	try {
			throw new IOException("Hello");
		} catch(IOException | Exception e) {
			System.out.println(e.getMessage());
		}*/
		
		/*String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);*/
//		System.out.println(Test1.test());
		
		Animal lion = new Lion();
		System.out.println( lion.getName() );
	}
	
	public static int test() {
	    try {
	        return 0;
	    }
	    finally {
	        System.out.println("finally trumps return.");
//	        return 5;
	    }
	}
	
}

class Super {
	private void foo() {
		System.out.println("Super");
	}
}

class Subclass extends Super {
	public void foo() {
		System.out.println("Subclass");
	}
}
