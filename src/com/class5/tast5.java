package com.class5;

import java.util.Scanner;

public class tast5 {
	
	public static void main(String[] args) {
		
		Scanner scan;
		double salesAmount;
		double commisson;
		
		 scan= new Scanner(System.in);
		 System.out.println("Please enter your sales amount");
		 salesAmount=scan.nextDouble();
		 
		 if(salesAmount<100) {
			 commisson=salesAmount*0.1;
			 
		 }else if(salesAmount>=100 && salesAmount<200) {
			 commisson=salesAmount*0.2;
			 
		 }else if(salesAmount>=200 && salesAmount<500) {
			 commisson=salesAmount*0.3;
			 
		 }else if(salesAmount>=500) {
			 commisson=salesAmount*0.5; 
		 }else {
			 commisson=0;
		 }
		 System.out.println("Basen on the sales your commisson is " +commisson);
		 
		 
		
			 

			 
		 }
		 
		
		
		
		
		
	}
	
	

