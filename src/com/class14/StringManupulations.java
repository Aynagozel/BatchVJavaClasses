package com.class14;

public class StringManupulations {
	public static void main(String[] args) {
		
	
	String str=new String("Hello");
	String str3=new String("Hello");
	System.out.println(str==str3);
	
	System.out.println("***************");
	
	String s1="Hello";
	String s2="Hello";
	System.out.println(s1==s2);
	
	System.out.println(str);
	String str2=str.replaceAll("Hello", "Bye");
	System.out.println(str2);
	
	String str4="23423Hell3049o^&*$%$";
	System.out.println(str4.replaceAll("[0-9]", ""));
	System.out.println(str4.replaceAll("[^a-zA-Z^]", ""));
	
	System.out.println("-------------------");
	
	System.out.println(str2.replaceFirst(" ", ""));
	System.out.println(str4.replaceAll("\\w ", ""));
}
}