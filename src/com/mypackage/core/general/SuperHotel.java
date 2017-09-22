package com.mypackage.core.general;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SuperHotel extends Hotel {
	
	/*public void method() {
		
	}*/

	public static void main(String args[]) {

		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2009);
		c.set(Calendar.MONTH, 6);
		c.set(Calendar.DAY_OF_MONTH, 1);
		String formattedDate = df.format(c.getTime());
		System.out.println(formattedDate);
		method();
		
		try {
            String arr[] = new String[10];
            arr = null;
            arr[0] = "one";
            System.out.print(arr[0]);
        } catch(Exception ex) {
            System.out.print("exception");
        } catch(NullPointerException nex) {
            System.out.println("null pointer exc");
        }
	}
}