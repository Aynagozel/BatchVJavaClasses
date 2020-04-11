package com.class23;

public class StoreProduct {

		 String label;
		double price ;
		String category;
		boolean hasExpiration; 
		int stock;
		// stock (represent the stock quantity)
	StoreProduct(String labell, double pricee, String categoryy, boolean hasExpirationn, int stockk){
		  label=labell;
		  price=pricee;
		  category=categoryy;
		  hasExpiration=hasExpirationn;
		  stock=stockk;
		}
		StoreProduct(String labell, double pricee, int stockk){
		  label=labell;
		  price=pricee;
		  category="misc";
		  hasExpiration=false;
		  stock=stockk;

		}
		StoreProduct(String labell, double pricee){
		  label=labell;
		  price=pricee;
		  category="null";
		  hasExpiration=false;
		  stock=0;
		}
		void disPlay(){
		  System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
		}
		}

