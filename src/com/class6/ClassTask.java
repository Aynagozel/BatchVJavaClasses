package com.class6;

import java.util.Scanner;

public class ClassTask {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Month of burn");
		String month=scan.nextLine();
		
		String season;
		
		if(month.equals("December") || month.equals("January") || month.equals("February")) {
			season="winter";
		}else if(month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if(month.equals("Sebtember") || month.equals("October") || month.equals("November")) {
			season="Fall";
		}else {
			season="Unknown";
		}
		System.out.println("You are born in "+month);
		
	}
	
	
}
