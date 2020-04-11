package com.class4;

public class NestedIf1 {

	public static void main(String[] args) {

		boolean quiz = true;
		int score = 89;

		if (quiz) {
			System.out.println(" Good job!!!");
		} else {
			System.out.println("Not good!!!");

			if (score >= 90) {
				System.out.println(" You got an A");
			} else if (score > 80) {
				System.out.println("You got an B");
			} else {
				System.out.println("You should study more");

			}
		}

	}
}
