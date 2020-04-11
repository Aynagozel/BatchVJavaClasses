package com.class6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter true or false for sale");
		boolean sale=scan.nextBoolean();
		
			
		if(!sale) {
			System.out.println("I am not shopping");
		}else {
			System.out.println("Please enter price:");
			
			int price=scan.nextInt();
			
			int price2, discount;
			if(price<20) {
				// to calculating with the price
				discount=10;
				price2=price-(price*10/100);
				
			}else if(price>= 100 && price < 500) {
				discount = 30;
				
				price2 = price - (price*30/100);
			}else {
				
				discount = 50;
				//calculate our final price
				price = price - discount;
			}
			System.out.println("After discount % "+ discount+ " the price of the item reduce to " +price);
		}
		
	}
}
