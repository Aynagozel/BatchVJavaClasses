package com.class6;

import java.util.Scanner;

public class SwitchStetement2 {

	public static void main(String[] args) {

		String country, foodName;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.println(" Please enter your country");
		country = scan.nextLine();

		switch (country) {

		case "Turkey":
			foodName = " kebab";
			break;
		case "Ethiopia":
			foodName = "Tibs";
			break;
		case "Morox":
			foodName = "Tajin";
			break;
		case "Kazakistan":
			foodName = "Kumus";
			break;
		case "Pakistan":
			foodName = "Beryani";
			break;
		case "Russia":
			foodName = "Caviar";
			break;
		case "Cuba":
			foodName = " Softita";
			break;
		default:
			foodName = "Unknown";

		}
		System.out.println(" You are from " + country + " and your favorite food is " + foodName);

	}

}
