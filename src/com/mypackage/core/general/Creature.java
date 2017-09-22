package com.mypackage.core.general;

public class Creature {

	private int legCount;
	protected int wingCount;

	public Creature(int legCount) {
		this.legCount = legCount;
		this.wingCount = 0;
	}

	public String toString() {
		return "legs=" + this.legCount + " wings=" + wingCount;
	}
}
