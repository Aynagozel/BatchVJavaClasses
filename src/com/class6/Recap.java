package com.class6;

import java.util.Scanner;

public class Recap {
	
	public static void main(String[] args) {
		
		Scanner scan;
		int quiz,midTerm, finalScore, avarage;
		
		scan=new Scanner(System.in);
		
		System.out.println(" Please enter quiz score");
		quiz=scan.nextInt();
		
		System.out.println("Please enter mid term score");
		midTerm=scan.nextInt();
		
		System.out.println("Please enter final score");
		finalScore=scan.nextInt();
		
		
		avarage=(quiz+midTerm+finalScore)/3;
		if(avarage>=90) {
			System.out.println("A");
		}else if(avarage>=70 && avarage<90) {
			System.out.println("B");
		}else if(avarage>=50 && avarage<70) {
			System.out.println("C");
			}else if(avarage<50) {
				System.out.println("D");
			}else {
				System.out.println("unknown");
				
				
			}
		}
	
}
