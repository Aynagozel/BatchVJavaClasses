package com.class5;

public class LogicalOperators2 {

	public static void main(String[] args) {

		String weekDay = "Monday";

		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println(" SDLC Class");
		} else if (weekDay.equals("Saturday") || weekDay.contentEquals("Sunday")) {
			System.out.println(" Java Class");
		} else if (weekDay.equals("Monday") || weekDay.equals("friday")) {
			System.out.println(" No School");
		} else if (weekDay.equals("Wednesday")) {
			System.out.println(" Review Class");

		} else {
			System.out.println("Not a valid day");
		}

	}

}
