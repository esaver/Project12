package com.mypackage.core.mkyong;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
	
	public static void main(String[] args) {
//		ArrayList<Dog> dogs1 = new ArrayList<Animal>();
//		ArrayList<Animal> animas1 = new ArrayList<Dog>();
		List<Animal> list = new ArrayList<Animal>();
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		List<Dog> dogList = dogs;
		ArrayList<Object> objects = new ArrayList<Object>();
		List<Object> objList = objects;
//		ArrayList<Object> objs = new ArrayList<Dog>();
//		ArrayList<Dog> objs2 = new ArrayList<Object>();
		
	}
}
