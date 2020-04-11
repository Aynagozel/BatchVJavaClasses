package com.class19;

public class Task5 {
	String createEmail(String name, String lastName, String type) {
	String email = name.toLowerCase()+lastName.toLowerCase()
	+"@"+type+".com";
	return email;
	
}
	boolean isPrime (int num) {
		boolean prime =true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
	}
	public static void main(String[] args) {
		Task5 obj=new Task5();
		String email =obj.createEmail("ayna","alty", "gmail");
		System.out.println(email);
		System.out.println(obj.isPrime(8));
		
	}
}