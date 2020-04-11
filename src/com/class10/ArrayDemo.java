package com.class10;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int[]nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		System.out.println(nums.length);
		System.out.println(0);
		
		
		String[]array= {"Winter", "Fall","Summer", "Spring"};
		
		System.out.println("I was born in "+array[2]);
		
		System.out.println(array.length);
		//array.length will return an integer
		
		int arraySize=array.length;
		
		System.out.println(arraySize);
		
		int[]score= {80,90,99,100,80};
		System.out.println("My score is "+score);
				
	}
}
