package com.class19;

public class Tasks {
	String createEmail(String name, String lastname, String emailType) {
		String email = name+lastname+"@"+emailType+".com";
		return email;
	}
	boolean isPrime(int num) {
		boolean prime =true;
		for(int i=2;i<=num/2; ++i) {
			if(num%i==0) {
				prime=false;
				break;
				
			}
		}
		return prime;
	}
	public static void main(String[]args) {
		Tasks t=new Tasks();
		String email=t.createEmail("ayna", "alty", "gmail");
		System.out.println(email);
		boolean p =t.isPrime(7);
		System.out.println(p);
	}
}
