package com.class4;

public class Nest {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 3.5;

		if (diploma) {
			System.out.println(" Congratulations!");
		} else {
			System.out.println("Get a degree!");
			if (gpa >= 3.5) {
				System.out.println(" You are eligible for scholorship");
			} else {
				System.out.println("You should have study hard");

				double mortgagePrice = 4.5;
				double allowedPrice = 3.7;

				if (mortgagePrice > 4.5) {
					System.out.println("Will Not Buy a House");
				} else {
					System.out.println("Will Consider Buying");
					if (allowedPrice > 200000) {
						System.out.println(" will take a loan");
					} else {
						System.out.println("Will pay cash");
					}
				}

			}

		}
	}

}
