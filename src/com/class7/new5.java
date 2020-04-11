package com.class7;

import java.util.Scanner;

public class new5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price;
		
		do {
			System.out.println("Please pay for your coffe");
			
			price=scan.nextInt();
			
		}while(price!=5);
		
		System.out.println("Enjoy your coffe");
	}
}
		
	
