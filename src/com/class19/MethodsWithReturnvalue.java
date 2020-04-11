package com.class19;

public class MethodsWithReturnvalue {
	
	int sum(int num1, int num2) {
		int c=num1+num2;
		return c;
	}
	public static void main(String[] args) {
		MethodsWithReturnvalue obj=new MethodsWithReturnvalue();
		
		int sum =obj.sum(50, 50);
		System.out.println("sum is "+sum);
		//this for largest
		int large=obj.findLargest(20, 40);
		System.out.println("Largest num is "+large);
		
	}
	//method to find largest number
	int findLargest(int num1, int num2) {
		int largest;
		if(num1>num2) {
			largest=num1;
		}else {
			largest=num2;
		}
		return largest;
	}
	//public static void main(String[] args) {
	
	
	
	}

