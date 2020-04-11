package com.class18;


public class Palindrome1 {
	String original,reversed;
	void palind() {
		if(original.equals(reversed)) {
			System.out.println("String is palindrome ");
		}else {
			System.out.println("String is NOT palindrome");
		}
	
	}
	public static void main(String[] args) {
		Palindrome1 name=new Palindrome1();
		name.original="Mom";
		name.reversed="Mom";
		name.palind();
	}
}
