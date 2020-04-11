package com.class20;

public class Task1 {
	
	String reverseString(String param) {
		String result="";
		char[]charArray=param.toCharArray();
		
		for(int i=charArray.length-1; i>=0; i--) {
			result += charArray[i];
		}
		return result;
	}
	public static void main(String[] args) {
		Task1 task=new Task1();
		String result=task.reverseString("Syntax");
		System.out.println(result);
	}
}
