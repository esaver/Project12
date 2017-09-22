package com.mypackage.core;

public class Climber {
	public static void main(String[] args) {
		check((h, l) -> h.toString(), 5);
	}
	
	private static void check(Climb climb, int height) {
		if(climb.isTooHigh(height, 10))
			System.out.println("too high");
		else System.out.println("ok");
	}
}
