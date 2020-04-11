package com.class9;

public class Task2 {
	
	public static void main(String[] args) {
		
		for (int i=1; i<10; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	
	for(int a=5; a >=1; a--) {
		for(int b=1; b<=a; b++) {
			System.out.print(a);
		}
		System.out.println();
	}
	for(int i=1; i<=5; i++) {
		for(int y=1; y<=i;y++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=4; i>=1; i--) {
		for(int y =1; y<=i; y++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}