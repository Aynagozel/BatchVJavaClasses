package com.class11;

public class TwoDarraysDemo2 {
	
	public static void main(String[] args) {
		
		String [][]names= {
				
				{"Khan", "Alex", "Yousuf", "Zynab"},
				{"Sona", "Ann", "Anna", "Ayna"},
				{"Ars", "Nury", "Ms", "Zynr"},
				{"Kan", "Durdy", "Yousuf", "Murat"}
				
		};
		int lengthOfRows=names.length;
		//System.out println(length);
		
		int lengthOfCols=names[1].length;
		System.out.println(lengthOfCols);
		
		for(String getArrays[]:names) {
			for(String getName: getArrays) {
				System.out.print(getName+ " ");
			}
			System.out.println();

	
			
		}
		
	
	}

}