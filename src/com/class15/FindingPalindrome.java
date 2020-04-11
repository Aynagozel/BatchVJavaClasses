package com.class15;

public class FindingPalindrome {
	public static void main(String[] args) {
		String original = "kayak";
		String reversed = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reversed = reversed + original.charAt(i);
		}
		System.out.println(reversed);
		if (original.equals(reversed)) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("string is not a palindrome");
		}
	}
}
