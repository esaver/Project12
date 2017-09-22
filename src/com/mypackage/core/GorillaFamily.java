package com.mypackage.core;

public class GorillaFamily {
	String walk = "walk";
	void everyOnePlay(boolean baby) {
		String approach = "amble";
		play(() -> walk);
		play(() -> approach);
	}
	
	void play(Gorilla g) {
		System.out.println(g.move());
	}
}
