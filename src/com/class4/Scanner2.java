package com.class4;

import java.util.Scanner;

public class Scanner2 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter temprature");
		int temp=scan.nextInt();
		
		System.out.println("Please enter your city");
		String Cityname=scan.next();
		
		int convertedTemp=(temp-32)*5/6;
		
		System.out.println(" the temprature in city "+Cityname + " is "+convertedTemp);
		
		
	}
}
