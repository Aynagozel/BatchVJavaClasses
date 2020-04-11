package com.class5;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		String human;
		if(age>1 && age<3) {
			//System.out.println("You are a baby");
			human="baby";
		}else if(age>=3 && age<5) {
			//System.out.println(" You are a toddler");
			human="toddler";
			
		}else if(age>=5 && age<12) {
			//System.out.println(" You are a kid");
			human="kid";
		}else if(age>=12 && age<19) {
			//System.out.println("You are a teenager");
			human="teenager";
		}else if(age>20){
			//System.out.println(" You are an adult");
			human="adult";
		}else {
			//System.out.println("Invalid age entered");
			human="unknown";
		}
		
		System.out.println("You are "+human);
		
	}
}
