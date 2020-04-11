package com.class11;

public class Task4 {
	
	public static void main(String[] args) {
		
		String[][] arr=new String[2][3];
		arr[0][0]="Apple";
		arr[0][1]="Orange";
		arr[0][2]="Grape";
		
		arr[1][0]="tomes";
		arr[1][1]="carrot";
		arr[1][2]="carrbage";
		
		System.out.println(arr[0][2]);
		
		int [][]numbers= {
				{8,7,5,3,8},
				{1,5,6,4,9},
				{3,6,8,0,7}
		};
		System.out.println("The value in index 1 and 4 is= " +numbers[1][4]);
		//To identify of the numbers Rows
		
		System.out.println("The numbers of Rows are:= "+numbers.length);
		//to identify the numbers of Columns/elements in that row
		
		System.out.println(" The number of the Columns:= " +numbers[1].length);
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
				
				}
			System.out.println();
			}
		
		
}
}