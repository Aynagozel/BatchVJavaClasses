package com.class10;

public class Task1 {
	
	public static void main(String[] args) {
		
		String[]cars=new String[6];
		cars[0]="Totota";
		cars[1]="Camry";
		cars[2]="Jeep";
		cars[3]="Honda";
		cars[4]="Mercedes";
		cars[5]="BMW";
		for(String car:cars) {
			System.out.println(car);
		}
	}
}