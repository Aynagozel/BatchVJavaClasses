package com.class11;

public class Recap {
	
	public static void main(String[] args) {
		
		for(int s=1; s<12; s++) {
			for (int k =1; k<=30; k++) {
				System.out.println(k+" "+s);
			}
		}
		int []arr= {2,3,5,7};
		for(int g=0; g<arr.length;g++) {
			System.out.println(arr[g]);
		}
		for(int ar:arr) {
			System.out.println(ar);
		}
		 int[]numbersList = {2,3,5,7};
		 
		 for (int elemen:numbersList) {
			 System.out.println(elemen);
		 }
		 String[]co = {" Turkmenistan", "Germany", " USA", "Mexcico"};
		 for(int i=0; i< co.length; i++) {
			 switch (co[i]) {
			 case "Turkmenistan":
				 System.out.println("Asghabat");
				 break;
			 case"Germany":
				 System.out.println("Berlin");
				 break;
			 case"USA":
				 System.out.println("Washington DC");
				 break;
			 case"Mexcico":
				 System.out.println("Mexcico City");
				 break;
			 }
		 }
		 System.out.println("---------------------------------------------");
		 String city = null;
	
		 for (String element : co) {
			 if (element.equals("Turkmenistan")) {
				 System.out.println("Ashgabat");
			 }else if (element.equals("Germany")) {
				 System.out.println("Berlin");
			 }else if(element.equals("USA")) {
				 System.out.println("Washington DC");
			 }else if(element.equals("Mexcico")) {
				 System.out.println("Mexcico City");
			 }
			 System.out.println("The capital of " + element + " is " +city);
		 }
	}
}
