package com.mypackage.core;

public interface CanWalk {
	default void walk() {
		System.out.println("Walking");
	}
}
