package com.class6;

import java.util.Scanner;

public class SameTask {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter quiz score");
		int quiz=scan.nextInt();
		
		System.out.println("Please enter midTerm score");
		int midTerm=scan.nextInt();
		
		System.out.println("Please enter finalScore");
		int finalScore=scan.nextInt();
		System.out.println(" Please enter quiz score");
		quiz=scan.nextInt();
		
		System.out.println("Please enter mid term score");
		midTerm=scan.nextInt();
		
		System.out.println("Please enter final score");
		finalScore=scan.nextInt();
		 System.out.println("Avarage");
		 int avarage=scan.nextInt();
		
		if(avarage>=90) {
			System.out.println("A");
		}else if(avarage>=70 && avarage<90){
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

