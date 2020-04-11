package com.class17;

public class Computer {
	String brand, name;
	int screen, memory;
	boolean keyboard;
	
	public static void main(String[] args) {
		 Computer c1= new Computer();
		 
		 c1.brand="Apple";
		 c1.name= "Macbook Pro";
		 c1.screen=13;
		 c1.memory=250;
		 c1.keyboard=true;
		 
		 System.out.println("I am coding on " + c1.name+ " with " + c1.screen + " screen and " +c1.memory + " mb memory. ");
	}
}
