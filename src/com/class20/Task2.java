package com.class20;

public class Task2 {
	
	public static void main(String[] args) {
		Task2 task=new Task2();
		
		String result=task.reverseString("Syntax");
		System.out.println(result);

	}
	String reverseString(String param) {
		String result="";
		
		char[]charArray=param.toCharArray();
		
		for(int i=0; i<charArray.length; i++) {
			
			result +=charArray[i];
		}
		return result;
		
	}
	
	
}
