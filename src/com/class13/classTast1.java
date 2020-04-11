package com.class13;

import java.util.Scanner;

public class classTast1 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your class day:: ");
		String day=scanner.nextLine();
		String day1=day.toLowerCase();
		
		if (day.trim().toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your java class");
		}else if(day.trim().toLowerCase().equals("sunday")) {
			System.out.println("Sunday is your Git class");
		}else if(day.trim().toUpperCase().equals("TUESDAY")){
			System.out.println("Tuesday is your SDLC class");
		}else if(day.trim().toLowerCase().equals("thursday")) {
			System.out.println("Thursday is your Manual Tewsting class");
		}else {
			System.out.println("Envalid Entry!! Please enter a valid class day ");
		}
		scanner.close();
		
		
	}
}
