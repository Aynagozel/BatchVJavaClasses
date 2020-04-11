package com.class11;

import java.util.Arrays;

public class Task6 {
	
	public static void main(String[] args) {	
			
	   int [] numbers= {123,34,15,16,99};
	   Arrays.sort(numbers);
	   
	   for(int i:numbers) {
		   System.out.println(i+ " ");
	   }
		
		for (int i =0; i<5; i++) {
			for(int j=0; j<=4; j++) {
				System.out.println("i= "+i+ "j= " +j);
				
			}
			System.out.println();
		}
		
		
		
		
	}
}
