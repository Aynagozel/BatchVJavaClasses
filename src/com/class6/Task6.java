package com.class6;

import java.util.Scanner;

public class Task6 {

		public static void main(String[] args) {
			
			String country, language;
			Scanner scan;
			
			scan = new Scanner(System.in);
			System.out.println(" Please enter your country");
			country = scan.nextLine();


			switch (country) {

			case "Turkey":
				language = "Turkish";
				break;
			case "Turkmenistan":
				language = "Turkmence";
				break;
			case "Morox":
				language = "Russia";
				break;
			case "Kazakistan":
				language = "Kazak";
				break;
			case "America":
				language = "English";
				break;
			case "Russia":
				language = "Russkiy";
				break;
			case "Uzbekistan":
				language = " Uzbek";
				break;
			default:
				language = "Unknown";

			}
			System.out.println(" You are from " + country + " and your favorite language is " + language);

		}

	

		}

