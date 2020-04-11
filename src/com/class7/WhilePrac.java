package com.class7;

public class WhilePrac {
	public static void main(String[] args) {

		int a = 10;
		while (a >= 1) {
			System.out.println(a);
			a--;
		}

		int b = 50;
		while (b >= 20) {
			System.out.println(b);
			b--;
		}
		// all even numbers
		int z = 2;
		while (z <= 20) {
			System.out.println(z);
			z += 2;
		}
		// 2 way using modules

		int q = 2;
		while (q <= 20) {
			System.out.println(".");
			if (q % 2 == 0) {
				System.out.println(q);

			}
			q++;
			
		}
		
		
	}

}
