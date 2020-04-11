package com.class7;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner scan;
		boolean isRain;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Is it raining?");
			isRain=scan.hasNext();
			
		}while(!isRain);
		
		System.out.println("Go to the park");
		
		
	}
}
