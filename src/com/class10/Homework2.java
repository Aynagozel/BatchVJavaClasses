package com.class10;

import java.util.Scanner;

public class Homework2 {
	
	public static void main(String[] args) {
		
		Scanner scan;
		int secretNumber, guestNumber;
		
		scan=new Scanner(System.in);
		secretNumber=12;
	
		do {
			System.out.println("Please guess my number from 1 to 20");
			guestNumber =scan.nextInt();
			
			if(guestNumber < secretNumber) {
				System.out.println("Your number is too small");
			}else if(guestNumber > secretNumber) {
				System.out.println("Your number is too large");
			}else {
				System.out.println("Congratalations you got it");
			}
		}while (guestNumber!= secretNumber);
	}
}
