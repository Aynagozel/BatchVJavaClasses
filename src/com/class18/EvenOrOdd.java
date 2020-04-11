package com.class18;

public class EvenOrOdd {

	void evenOrOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}

	}

	public static void main(String[] args) {

		EvenOrOdd number = new EvenOrOdd();
		number.evenOrOdd(45);
	}
}
