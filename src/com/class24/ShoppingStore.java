package com.class24;

public class ShoppingStore {
	String item;
	double price;
	double quantity;

	public ShoppingStore(String item, double price, double quantity) {
		this.item=item;
		this.price=price;
		this.quantity=quantity;
	}
	public double itemTotalPrice() {
		double totalPrice=this.price*this.quantity;
	
	System.out.println(this.item+" Total Value "+totalPrice);
	return totalPrice;
}
}