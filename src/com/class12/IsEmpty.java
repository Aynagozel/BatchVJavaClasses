package com.class12;

public class IsEmpty {
	
	public static void main(String[] args) {
		
		String str=" ";
		boolean isEmpty=str.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("_____________isEmpty()_____________");
		
		String str1="hello ";
		String str2="Ali!";
		System.out.println(str1+ str2);
		System.out.println(str1.concat(str2));
		
		System.out.println("__________--__________--");
		
		String expected="You may qualify for a multi-policy discount!";
		String actual="You may qualify for a multi-policy discount!";
		
		
		expected=expected.trim();
		//actual=actual.trim();
		System.out.println(expected.equals(actual));
		
	}
}
