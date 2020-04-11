package com.class7;

public class Prac {
	
	public static void main(String[] args) {
		
		int even=20;
		do {
			System.out.println(even);
			even+=2;
		}while(even<=50);
	System.out.println("--------------------Second way---------------------------");	
		
		//2 way
		
		do {
		if(even%2==0) {
			System.out.println(even);
		}	
		even++;
		}while(even<49);
	}
	
}
