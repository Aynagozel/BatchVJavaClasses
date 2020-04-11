package com.class4;

public class NestedIFMore {
	
	public static void main(String[] args) {
		
		int age= 55;
		
		if(age<16) {
			System.out.println(" You are too young to drive");
		}else {
			System.out.println("You are eligible to drive");
		}
		
		if (age>=18){
			System.out.println(" You can drive alone");
		}else {
			System.out.println("You need to parents to drive");
			System.out.println("------------------------------------------------------------");
			
			boolean quiz=true;
			int score=89;
			
			if (quiz) {
				System.out.println(" Good job!!!");
			}else {
				System.out.println("Not good!!!");
			}
			
		}
		
	}
}
