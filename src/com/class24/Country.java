package com.class24;

public class Country {
	public String capital, name;
	public int population;
	
	public Country(){
		System.out.println("I am non argument constructor");
	}
	
	Country(String name, String capital, int population) {
		this.name=name;
		this.capital=capital;
		this.population=population;
	}
	
	Country(String name, String capital){
		name=name;
		capital=capital;
	}
	
	public void displayInfo() {
		System.out.println(name+" "+capital);
	}
	
	public static void main(String[] args) {

		Country country1=new Country("USA", "Washington DC");
		country1.displayInfo();
		
}
}
