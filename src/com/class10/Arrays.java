package com.class10;

public class Arrays {
	
	public static void main(String[] args) {
		
		int[]b;
		b=new int[4];//declare and initilazation
		//2 way--> all in 1 line(declaration & initialation)
		int[]array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		System.out.println(0);
		
	
	// lets create an array that will store classes
	String[]classes=new String[4];
	classes[0]="Java";
	classes[1]="SDLC";
	classes[2]="Manual Testing";
	classes[3]="Git";
	//Today we have Java class
	System.out.println(" Today we have "+classes[0]+ " class");


int[]nums=new int[3];
nums[0]=1;
nums[1]=2;
nums[2]=3;
// how can I change 1 to 100
nums[0]=100;
System.out.println(nums[0]);

String[]names=new String[3];
names[0]="Ayna";
names[1]="Maysa";
names[2]="Sona";
System.out.println(names[2]);
}
}