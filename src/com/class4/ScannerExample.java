package com.class4;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the amound is needed?");
		int loan=scan.nextInt();
		
		if(loan<200.000) {
			System.out.println("You would lend the money");
		}else {
			System.out.println("You would reject the client");
		}
		
	}
}
