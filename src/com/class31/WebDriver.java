package com.class31;

public class  WebDriver {


	interface TakesScreenshot {
		//public static final 
		String $FILE_EXTENSION=".png";
		void takesScreen();
		//added from jdk 1.8
		static void takeSelfie() {
			System.out.println("I am defined static method of TakesScreenshot interface");
		}
		
		default void takePictures() {
			System.out.println("I am default defined method of TakesScreenshot interface");
		}
	}

	interface Application{
		void applicationTest();
	}
}

	