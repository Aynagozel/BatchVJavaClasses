package com.class19;

public class Task7 {
	boolean isOdd(int num) {
		boolean isOdd;
		
		if(num%2!=0) {
			isOdd=true;
		}else {
			isOdd=false;
		}
		return isOdd;
	}
	
	public static void main(String[] args) {
		
	
	Task7 obj =new Task7();
	boolean odd=obj.isOdd(300);
	System.out.println(odd);
	//*************************
	int mult =obj.mult(10,20);
	System.out.println(mult);
	
	}
	
	int mult(int num1, int num2) {
		int mult=num1*num2;
		return mult;
	}
	
}