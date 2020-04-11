package com.class19;

public class Task2 {
	String createEmail(String name, String lastName, String type) {
		String email=name+lastName+"@"+type+".com";
		return email;
		
	}
	public static void main(String[] args) {
		Task2 obj=new Task2();
		String email=obj.createEmail("ayna","alty","gmail");
		System.out.println(email);
	}
}
