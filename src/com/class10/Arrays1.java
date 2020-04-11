package com.class10;

public class Arrays1 {
	
	public static void main(String[] args) {
		
		int[]b;
		b=new int[4];
		//2 way
		int[]array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		//access value from an array
		System.out.println(array[2]);
		//lets create an array that will store classes
		String[]classes=new String[4];
		classes[0]="Java";
		classes[1]="SDlC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		//Today we have Java class
		System.out.println("Today we have "+classes[0]+" class");
		
	}
}
