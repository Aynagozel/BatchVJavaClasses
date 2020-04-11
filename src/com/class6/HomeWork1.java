package com.class6;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {

		Scanner scan;
		int a = 30, b = 20, c = 10, avarage;

		scan = new Scanner(System.in);

		System.out.println(" Please enter Larger number");
		a = scan.nextInt();

		System.out.println("Please enter Largest number");
		b = scan.nextInt();

		System.out.println("Please enter small number");
		c = scan.nextInt();

		avarage = (a + b + c) / 3;
		String larger;
		if (a >= b) {
			// System.out.println("A is larger number");
			larger = "a";
		} else if (a >= b && a > c) {
			// System.out.println("A is largest number");
			larger = "b";
		} else if (b > c) {
			// System.out.println("B is largest than C");
			larger = "c";
		} else if (c > 0) {
			// System.out.println("C is small number");
			larger = "unknown";
		} else {
			System.out.println("unknown");

		}
		System.out.println(" Largest number is " + a);
	}

}
