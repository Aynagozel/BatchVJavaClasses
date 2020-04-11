package com.class7;

public class Task3 {

	public static void main(String[] args) {

		boolean workDay = true;
		int day = 1;

		while (workDay) {
			 
			if(day == 6) {
				
				workDay = false;
				System.out.println("I do not need a day off anymore");
				
			}else {
			System.out.println("I need a day off");
			}
			day++;
		}

	}
}
