package com.mypackage.core.general;

public class SwitchTest {

	public static void main(String[] args) {
		
		String day = "THU1";
		
		switch (day) {
		case "MON":
				System.out.println("Its Monday !!");
			break;
		case "TUE":
			System.out.println("Its Tuesday !!");
		break;
		case "WED":
			System.out.println("Its Wednesday !!");
		break;
		case "THU":
			System.out.println("Its Thursday !!");
		break;
		default:
			System.out.println("Wrong day !!");
			break;
		case "FRI":
			System.out.println("Its Friday !!");
		break;
		case "SAT":
			System.out.println("Its Saturday !!");
		break;
		case "SUN":
			System.out.println("Its Sunday !!");
		break;
		
//		System.out.println(toString());

		}
	}
	
/*	public static String toString(){
		System.out.println("Test toString called");
		return "";
	}*/

}
