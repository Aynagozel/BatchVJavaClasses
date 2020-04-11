package com.class18;

public class EvenOrOdd1 {
	void evenOrOdd(int a) {
		if(a%2==0) {
			System.out.println(a+ " is even number ");
		}else {
			System.out.println(a+ " is odd number");
		}
	}
	public static void main(String[] args) {
		EvenOrOdd num=new EvenOrOdd();
		num.evenOrOdd(45);
	}
}
