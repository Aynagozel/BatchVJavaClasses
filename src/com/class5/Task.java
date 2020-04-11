package com.class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have credid card? True or false?");
		boolean cc = scan.nextBoolean();

		if (cc) {
			System.out.println("What is the balance on your card?");
			int balance = scan.nextInt();

			if (balance > 1000) {
				System.out.println(" Please pay off your balance");
			}
		} else {
			System.out.println(" You can spend more money");

		}
	}

}
