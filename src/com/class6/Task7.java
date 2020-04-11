package com.class6;

import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args) {
		
		String grade;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=scan.nextLine();
		
		switch(grade){
		case "A":
			grade = " Excelent";
			break;
		case "B":
			grade ="Good";
			break;
		case "C":
			grade = "Avarage";
			break;
		case "D":
			grade = " Bad ";
			break;
		default:
			grade ="Not acceptable";
			
		
		}
		System.out.println(" Your grade is " +grade);
	}
}
