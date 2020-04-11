package com.class12;

public class StringManupilations {
	
	public static void main(String[] args) {
		//containing-->check for value specific value
		String str="Good morning, students!";
		boolean contains=str.contains("morning");
		System.out.println(contains);
		
		
		String present="Welcome, Mehmet";
		boolean flag=present.contains("Welcome,");
		System.out.println(flag);
		
		String present1="Welcome, Mehmet567788";
		String neededValue="Welcome";
		
		boolean flag1=present.contains(neededValue);
		System.out.println(flag1);
		
		String str2="syntax";
		
		boolean starts=str2.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str2.endsWith("x"));
		
		String str3="Hello";
		
		boolean isEmpty=str3.isEmpty();
		System.out.println(isEmpty);
		
	
		
	}
}
