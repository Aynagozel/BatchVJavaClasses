package com.class23;

public class Dog {
	String dogName;
	double dogWeight;
	static String dogBreed = "Mutt";
	
	Dog(String name, String breed, double weight){
		
		dogName=name;
		dogBreed=breed;
		dogWeight=weight;
	}
	Dog(String name,double weight){
    dogName=name;
		dogWeight=weight;
	
	}
	
	void display(){
	  	System.out.println(dogName+" " +dogBreed+" " +dogWeight);
	}
}
