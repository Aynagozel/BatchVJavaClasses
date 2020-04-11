package com.class19;

public class Task3 {
	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		String email=obj.createEmail("ayna","alty","yahoo");
		System.out.println(email);
		
		email=obj.createEmail("Ana","abaya"," outlook");
		System.out.println(email);
	}
	String createEmail(String name, String lastName, String emailType) {
		String email=name+lastName+"@"+ emailType+".com";
		return email.toLowerCase();
	}
}
