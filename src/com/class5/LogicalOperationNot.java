package com.class5;

public class LogicalOperationNot {

	public static void main(String[] args) {

		boolean traffic = true;

		if (!traffic) {
			System.out.println("On time");
		} else {
			System.out.println("late");

			boolean isRain = false;

			if (!isRain) {
				System.out.println(" Take un umbrella");
			} else {
				System.out.println(" Do not take an umbrella");
				// compare to not operators

				int num1 = 10;
				int num2 = 11;

				if (num1 == num2) {
					System.out.println("Numbers are equals");
				} else {
					System.out.println("Numbers are not equal");

					if (!(num1 == num2)) {
						System.out.println("Numbers not equal");
					} else {
						System.out.println("Numbers are equal");
					}
				}
			}

		}

	}

}
