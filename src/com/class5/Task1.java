package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter numbers");
		int num = input.nextInt();

		if (5 >= 5) {
			System.out.println("Eligible for the bonus");

			if (5000 >= 5000) {
				System.out.println("You can get as bonus 50000");

			} else {
				System.out.println("You can get as bonus 30000");
			}
		} else {
			System.out.println(" Not eligible");
		}

	}
}
