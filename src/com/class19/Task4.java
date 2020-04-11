package com.class19;

public class Task4 {
	
	String createEmail(String name, String lastName, String emailType) {
	String email;
	email=name+lastName+"@"+emailType+".com";
	return email;
	
}
	public static void main(String[] args) {
		Task4 e=new Task4();
		String email=e.createEmail("ayna","alty","gmail");
		System.out.println(email);
	}
}