package com.class12;

public class Task1 {
	
	public static void main(String[] args) {
		
		String[][]groceryList= {
				{"Banana", "orange", " apple"},
				{"Onion", "potato", "cucumber"},
				{"Yogurt", "cheese", "milk"}
		};
		
		for(String[]list:groceryList) {
			for(String item:list) {
				System.out.print(item+" ");
			}
			System.out.println();
		}
		
	}
}
