package com.class12;

public class CharPrac {
	
	public static void main(String[] args) {
		
		String str="Sunday";
		int index=str.indexOf("d");
		System.out.println(index);
		
		
		String str1="Syntax Technologies";
		
		System.out.println(str1.indexOf("Syntax"));//0
		System.out.println(str1.indexOf("Technologies"));//7
		System.out.println(str1.indexOf(" "));//6
		System.out.println(str1.indexOf("w"));//-1
		
		String str2="Today is Sunday Java class";
		
		String newString=str2.substring(9);
		
		System.out.println(newString);
		
		System.out.println(str2.substring(0,5));//Today
		System.out.println(str2.substring(9, 20));//Sunday Java
		System.out.println(str2.substring(16,20));//Java
		System.out.println(str2.substring(21));
	}
}
