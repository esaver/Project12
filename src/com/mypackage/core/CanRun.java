package com.mypackage.core;

public interface CanRun {
	public default void walk() {
		System.out.println("Walking");
	}
	
	public abstract void run();
}
