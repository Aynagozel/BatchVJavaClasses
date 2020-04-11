package interview;

import java.util.Arrays;

public class IQ1 {

	public static void main(String[] args) {
		
		//1. Write a program to swap 2 numbers without a temporary variable? Swap 2 strings
		//without a temporary variable?
		// swap numbers

		int a = 10;
		int b = 20;
		a = a + b;// first this should be there a=10+20=30
		b = a - b; // b= 30-20=10
		a = a - b; // a=30-10=20
		System.out.println(a);
		System.out.println(b);

		// swap strings
		String x = "Hello";
		String y = "Welcome";
		x = x + y; // HelloWelcome
		y = x.substring(0, (x).length() - y.length());
		x = x.substring(y.length());
		System.out.println(x);
		System.out.println(y);
		
		/*
		 * 2. Write a java program to find the second largest number in the array? Maximum
			and minimum number in the array?
		 */

		// second largest number in the array
		// 1. easiest way
		int[] numArray = { 12, 13, 12, 15, 0, -1 };
		Arrays.sort(numArray);
		System.out.println(numArray[numArray.length - 2]);
		// 2. more efficient way
		int[] array = { 1, -1, 1000, 1000, 222, 11 };
	}
}
