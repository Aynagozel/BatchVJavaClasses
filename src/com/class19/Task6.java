package com.class19;

public class Task6 {
	
	String createEmail(String userName, String userLastName, String userEmail) {
		String email=userName+"."+userName+"@"+userName;
		return email;
	}
	boolean isPrime(int num) {
		boolean prime =true;
		for(int i=1;i<=num/2; i++) {
			if(num%i==0) {
				prime= false;
				break;
			}
		}return prime;
	}
	public static void main(String[] args) {
		Task6 task =new Task6();
		String email=task.createEmail("syntax","Technologies"," syntax.com");
		System.out.println(email);
		boolean t=task.isPrime(5);
		System.out.println(t);
	}
}