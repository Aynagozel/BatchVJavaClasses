package com.class4;

import java.util.Scanner;

public class ScannerPrac {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(" Please enter your age");
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println(" you will issue a driver lisence to them");
		} else {
			System.out.println(" You will offer them to get a learners permit");
		}

	}
}
