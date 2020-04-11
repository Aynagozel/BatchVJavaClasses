package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i=0; i<=4; i++) {
			System.out.println("Good morning");
		}
		for (int i=1; i<=10; i++ ) {
			System.out.println(i);
		}
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		for( int i=0; i<=50; i+=5) {
			System.out.println(i);
		}
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
