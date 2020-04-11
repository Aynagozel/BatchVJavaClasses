package com.class7;

public class Note {
	
	public static void main(String[] args) {
		//int, short, byte, char, String

		char gender='M';

		switch(gender) {
			case 'M':
					System.out.println("Male");
					break;
			case 'F':
					System.out.println("Female");
					break;
			default: 
					System.out.println("Unknown gender");
		}

		if (gender=='M'){
			System.out.println("Male");
		} else if (gender=='F'){
			System.out.println("Female");
		} else {
			System.out.println("Unknown gender");
		}

		int num=10;

		if (num<0){
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is positive");
		}

		switch (num){	
		
		
		//case num>0 --> not valid scenario
		}
		//switch CANNOT be used with relational (>, >=, <, <=)
				

	}
}

