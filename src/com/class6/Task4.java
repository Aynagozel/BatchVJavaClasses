package com.class6;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println(" Is there any discount? True or false");
		boolean sale=input.nextBoolean();
		
		double price;
		double discount;
		double finalPrice;
		
		
		if(!sale) {
			System.out.println("I am not gonna shop!");
			
		}else {
			System.out.println("What is the actual price?");
			
			price=input.nextDouble();
			
			if(price<20) {
				discount =price *0.10;
				finalPrice=price - discount;
				
			}else if(price >=20 && price<100) {
				discount = price *0.20;
				finalPrice= price - discount;
			}else if(price >=100 && price <500) {
				discount = price *0.30;
				finalPrice = price - discount;
			}else {
				discount = price *0.50;
				finalPrice = price -discount;
			}
			System.out.println(" After discount "+ discount+" the price of the item reduce from "+price+" to "+finalPrice);
			
		}
		
		
		
	}
}
