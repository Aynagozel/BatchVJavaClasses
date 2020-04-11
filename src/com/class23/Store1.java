package com.class23;

public class Store1 {
	public static void main(String[] args)
	{
	  StoreProduct obj1=new StoreProduct("Eggs",3," Produce ",true,10);
	 StoreProduct obj2=new StoreProduct("Paper Towels", 2, 24);
	  
	  StoreProduct obj3=new StoreProduct("Paper Towels", 2);
	  obj1.disPlay();
	  obj2.disPlay();
	  obj3.disPlay();
	
	}
}

