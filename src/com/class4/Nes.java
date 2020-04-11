package com.class4;

public class Nes {
	public static void main(String[] args) {
		double rate = 5.5;
		double price = 20000000;

		if (rate > 4.5) {
			System.out.println("I Will Not Buy a House");
		} else {
			System.out.println("I Will Consider Buying");
			if (price > 200000) {
				System.out.println(" I will take a loan");
			} else {
				System.out.println("I Will pay cash");
			}
		}

	}

}
