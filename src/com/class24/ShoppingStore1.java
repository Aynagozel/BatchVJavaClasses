package com.class24;

public class ShoppingStore1 {
	 public static void main(String[] args) {
	      ShoppingStore blancket = new ShoppingStore("Blancket" , 49.99, 2);
	      ShoppingStore mattress = new ShoppingStore("Mattress" , 219.59, 2);
	      
	      double blanketTotalPrice = blancket.itemTotalPrice(); 
	      double mattressTotalPrice = mattress.itemTotalPrice(); 
	      double sumPurchase = blanketTotalPrice + mattressTotalPrice; 
	     
	      System.out.println("You purchased " + sumPurchase + " Today");
}
}
