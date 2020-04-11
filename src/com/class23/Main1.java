package com.class23;

public class Main1 {
	public static void main(String[] args) {
	
	  
    Car1 c1 = new Car1("Toyota","Prius",4,120,30000);
    
    Car1 c2 = new Car1("Toyota","Prius",120,30000);
    Car1 c3 = new Car1(4,120,30000);
    Car1 c4 = new Car1("Toyota","Prius",4);
    c1.display();
    c2.display();
    c3.display();
    c4.display();
	}
}
