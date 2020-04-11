package com.class12;

public class StringManupulation3 {
	
	public static void main(String[] args) {
		
		String str=" Students";
		
		char character=str.charAt(8);
		System.out.println(character);
		
		for(int i=0; i<str.length();i++) {
			System.out.print(str.charAt(i)+",");
		System.out.println("--------");	
			String str1="Sunday";
			
			int index=str1.indexOf("d");
			System.out.println(index);
		}
	}
}
