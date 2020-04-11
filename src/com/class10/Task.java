package com.class10;

import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter start number");
		int start=scan.nextInt();
		System.out.println("Please enter ending number");
		int end=scan.nextInt();
		
		int even=0;
		int odd=0;
		for(int i=start; i<end;i++) {
			if(i%2==0) {
				even=even+i;
			}else {
				odd=odd+i;
			}
			System.out.println("The sum of even numbers "+even);//24
			System.out.println("The sum of odd numbers"+odd);//23
		}
	}
}
// int start=0;

	
