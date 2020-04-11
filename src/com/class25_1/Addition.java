package com.class25_1;

public class Addition {
	//method overloading:
		//1 by passing different amount of parameters	
		
		public void add(int num1, int num2) 
		
		{
			System.out.println(num1+num2);
		}
		
//		protected int add(int num1, int num2) -> compiler will give an error
//		{
//			return num1+num2;
//		}
			
		public void add(int num1, int num2, int num3) {
			System.out.println(num1+num2+num3);
		}
		//2 by having different types of parameters	
		public void add(double num1, double num2) {
			System.out.println(num1+num2);
		}
		
		public double add(int num1, double num2) {
			double sum=num1+num2;
			return sum;
		}
		
		public void add(double num1, int num2) {
			System.out.println(num1+num2);
		}
}
