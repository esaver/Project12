package com.mypackage.core.general;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try {
			testException(-5);
			testException(-10);
		}
		//some comment 1
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//some comment 2
		catch (IOException e) {
			e.printStackTrace();
		}
		//some comment 3
		finally {
			System.out.println("Releaseing System Resources !!");
		}
		testException(15);
	}

	private static void testException(int i) throws FileNotFoundException, IOException {
		if (i < 0) {
			FileNotFoundException myException = new FileNotFoundException("Negative Integer " + i);
			throw myException;
		} else if (i > 10) {
			throw new IOException("Only supported for index 0 to 10");
		}
	}

}
