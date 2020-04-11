package com.class19;

public class Recap {
	void sum (int num1, int num2) {
		int c=num1+num2;
		System.out.println("The sum of 2 number is = "+c);
	}
//	public static void main(String[] args) {
		//Recap obj=new Recap();
		//.sum(10, 30);
		
	
	//create method to display say hello 5 times
	int sayHello(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("Hello");
		}
		return times;
	}
	public static void main(String[] args) {
		Recap obj=new Recap();
		obj.sum(5, 7);
		obj.sayHello(5);
		
	}
		
	}
	

	

