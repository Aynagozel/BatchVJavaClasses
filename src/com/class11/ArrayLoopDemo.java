package com.class11;

public class ArrayLoopDemo {
	
	public static void main(String[] args) {
		
		String[]countries = { "India", " Canada", " USA"};
		for(String getCountry: countries) {
			if(getCountry.equals("USA")) {
			System.out.println("DC");
		}else if(getCountry.equals("India")) {
			System.out.println("Hindistan");
		}else if(getCountry.equals("Canada")) {
			System.out.println(" Belciko");
		}
			System.out.println(getCountry);
	}
		for(int i = 0; i < countries.length; i++) {
			if(countries [i].equals("USA")) {
				System.out.println("DC");
			}
		}
}
}