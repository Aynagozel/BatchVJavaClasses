package com.class17;

public class Phone {
	String brand, name, model, color;
	boolean toachscreen;
	int memory;

	void call() {
		System.out.println("I can make call on my " + name);
	}

	void checkMails() {
		System.out.println("I can check my emails from my " + name);
	}

	void surfInternet() {
		System.out.println("I can surf internet in my " + name);
	}

	public static void main(String[] args) {

		Phone phone1 = new Phone();
		phone1.brand = "Apple";
		phone1.name = "IPhone";
		phone1.model = "Iphone11 Pro Max";
		phone1.memory = 256;

		System.out.println("I have " + phone1.brand + " " + phone1.name + " " + phone1.model + " " + phone1.memory
				+ " and i love it");
		phone1.call();
		phone1.checkMails();
		phone1.surfInternet();
	}

	// TODO Auto-generated method stub

}
