package com.class10;

public class TaskClass {
	
	public static void main(String[] args) {
		
		String[]animals= {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		
		int size=animals.length;
		
		for(int i=0;  i<=size; i++) {
			
			System.out.print(animals[i]+" ");
			
			for(int b=0; b<animals.length; b++) {
				if(animals[b].equals("Dog")){
					System.out.println("I love dogs");
				}else {
					System.out.println(animals[b]);
				}
			}
		}
		
		
	}
}
