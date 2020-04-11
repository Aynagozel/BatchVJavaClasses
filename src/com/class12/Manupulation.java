package com.class12;

public class Manupulation {
	
	public static void main(String[] args) {
		
		String str="Syntax Technologies";
		int lengthOfString=str.length();
		
		String str1="Welcome, students!";
		System.out.println(str1.length());
		
		
		String str2="Hello";
		
		String newString=str2.toUpperCase();
		System.out.println(newString);
		
		
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		
		
		String str3="Hello";
		String str4="hello";
		
		boolean equality=str3.equals(str4);
		System.out.println(equality);
		
		
		String expectedBrowser="Chrome";
		String actualBrowser="chrome";
		
	boolean equals = expectedBrowser.equalsIgnoreCase(actualBrowser);
	System.out.println(equals);
	}
}
