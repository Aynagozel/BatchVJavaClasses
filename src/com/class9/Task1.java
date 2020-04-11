package com.class9;

public class Task1 {

	public static void main(String[] args) {

		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					for (int d = 0; d < 10; d++) {
						System.out.println(a + "" + b + "" + c + "" + d);
					}

				}
				for (int i = 0; i < 5; i++) {
					for (int y = 1; y < 7; y++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}

			for (int i = 1; i < 5; i++) {
				for (int j = 1; j < 6; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		for (int y = 1; y < 6; y++) {
			for (int k = 1; k < 10; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

		for (int l = 5; l >= 1; l--) {
			for (int f = 5; f >= 1; f--)
				System.out.print(f);
		}
		System.out.println();
	}
}
