package com.mypackage.core.general;

public class MyKey /*implements Comparable<MyKey>*/{
	
	private String name;

	public MyKey(String string) {
		this.name = string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*@Override
	public int compareTo(MyKey o) {
		return this.getName().compareTo(o.getName());
	}*/

	@Override
	public String toString() {
		return "MyKey [name=" + name + "]";
	}
	
}
