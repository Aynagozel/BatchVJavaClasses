package com.class6;

import java.util.Scanner;

public class CalculateOperatorsWithSwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1, num2, total=0;
		char operator;

		System.out.println("Enter first number");
		num1 = scan.nextInt();

		System.out.println("Please enter operator");
		operator = scan.next().charAt(0);

		System.out.println("Enter second number");
		num2 = scan.nextInt();

		switch (operator) {
		case '*':
			total = num1 * num2;
			break;

		case '/':
			total = num1 / num2;
			break;

		case '+':
			total = num1 + num2;
			break;

		case '-':
			total = num1 - num2;
			break;

		default:
			System.out.println(" Wrong operator ");
		}
		System.out.println(total);
	}
}
