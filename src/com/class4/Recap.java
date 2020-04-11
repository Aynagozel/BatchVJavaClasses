package com.class4;

public class Recap {

	public static void main(String[] args) {

		int num;
		num = 0;

		if (num > 0) {
			System.out.println(num + " is a positive number");
		} else if (num == 0) {
			System.out.println(" Value of num is " + num);
		} else {
			System.out.println(num + " is a negative number");
		}

		int i = 12;

		if (i % 2 == 0) {
			System.out.println(i + " is an even number");
		} else {
			System.out.println(i + " in an odd number");
			//

			if (i % 2 != 0) {
				System.out.println(i + " is an odd number");
			} else {
				System.out.println(i + " is an even number");
				int day = 4;
				if (day == 2) {
					System.out.println(" SDLC Class");
			} else if (day == 3) {
					System.out.println("Java Review Class");
				} else if (day == 4) {
					System.out.println("SDLC Class");
				} else if (day == 5) {
					System.out.println("Java coding");
				} else if (day == 7) {
					System.out.println("Favorite Java Class");
				} else {
					System.out.println(" There is no class at school");
				}
			}
		}
	}
}
