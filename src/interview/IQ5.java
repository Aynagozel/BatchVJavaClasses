package interview;

public class IQ5 {
	public static void main(String[] args) {
		
		// 7. Write a java program to check whether a given number is prime or not?

		int num = 37;
		boolean isPrime = true;
		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is NOT a prime number");
		}

		// 8. Write a Java Program to print the first 10 numbers of Fibonacci series.

		int a = 0, b = 1, c;
		for (int i = 0; i < 10; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}
}
