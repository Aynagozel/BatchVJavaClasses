package com.class13;

public class StringManipulation1 {
	public static void main(String[] args) {
		
		//substring
		// This method returns a new string that is a substring of this string.
		
		String str="Java is getting interesting";
		
		System.out.println(str.substring(10));
		
		/*
		 * String substring (int beginIndex, int endIndex)
		 * This method returns a new string that is a substring
		 * that begins with one character at the specified index
		 * and extends to the end iof this strings
		 * 
		 */
		
		System.out.println(str.substring(8, 15));
	}
}
