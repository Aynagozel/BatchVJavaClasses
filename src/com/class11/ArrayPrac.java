package com.class11;

import java.util.Arrays;

public class ArrayPrac {
	
	public static void main(String[] args) {
		
		String[]actualNames= {"John", "Smith","Alex","Tanaz"};
		String[]expectedNames= {"Smith", "John", "Alex", "Tanaz"};
		
		Arrays.sort(actualNames);
		Arrays.sort(expectedNames);
		System.out.println(Arrays.toString(actualNames));
		
		
		System.out.println(Arrays.toString(actualNames));
		
		
		
		String actual=Arrays.toString(actualNames);
		String expected=Arrays.toString(expectedNames);
		System.out.println(actual.equals(expected));
	}
	String fName="Zom";
	String sName="Ali";
	String fName1="Zom";
	String sName2="Ali";
	
	String actl=fName+sName;
	String expc=fName1+sName2;
	// This was examle//This code is not true.


	
	
	
}
