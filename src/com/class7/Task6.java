package com.class7;

import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int price1;
		
		System.out.println("Please pay for your coffe");
		price1=scan.nextInt();//4
		
		while(price1!=5) {
			System.out.println("Please pay for your coffe");
			price1=scan.nextInt();
		}
		}
	
	}

