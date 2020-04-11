package com.class6;

import java.util.Scanner;

public class New3 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 5;
		
		
		while (i < 9) {
			System.out.println("Please enter your name");
			
			String name=scan.nextLine();
			
			System.out.println("Good afternoon " + name);
			i++;
		}
	}
}



