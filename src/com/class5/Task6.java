package com.class5;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your score");
		int score = scan.nextInt();
		String grade;

		if (score >= 90) {
			// System.out.println(" A student");
			grade = "A student";
		} else if (score >= 70 && score < 90) {
			// System.out.println(" B student");
			grade = "B student";
		} else if (score >= 50 && score < 70) {
			// System.out.println(" C student");
			grade = "C student";
		} else if (score < 50) {
			// System.out.println(" F grade");
			grade = "F student";
		} else {
			// System.out.println(" No grade");
			grade = "No grade";
		}
		System.out.println(" Your grade is " + grade);
	}
}