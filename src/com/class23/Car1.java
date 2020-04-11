package com.class23;

public class Car1 {
	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;
	
	Car1(String makee, String modell, int numberOfDoorss, int topSpeedd, double pricee){
		make=makee;
		model=modell;
		numberOfDoors=numberOfDoorss;
		topSpeed=topSpeedd;
		 price=pricee;
	}
	Car1(String makee, String modell, int topSpeedd,double pricee){
		 make =makee;
		  model =modell;
		  topSpeed = topSpeedd;
		  price = pricee;
		  numberOfDoors =4;
	}
	Car1(int numberOfDoorss, int topSpeedd,double pricee){
		make="unknown";
		model="unknown";
		numberOfDoors=numberOfDoorss;
		topSpeed=topSpeedd;
		price=pricee;
	}
	Car1(String makee, String modell, int numberOfDoorss){
		make = makee;
		  model = modell;
		  numberOfDoors = numberOfDoorss;
		  topSpeed =90;
		  price =0.0;
	}
	void display() {
		System.out.println(make+ " "+ model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
}
