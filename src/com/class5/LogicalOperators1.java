package com.class5;

public class LogicalOperators1 {

	public static void main(String[] args) {

		int day = 7;
		if (day == 2 || day == 4) {
			System.out.println("SDLC Class");
		} else if (day == 6 || day == 7) {
			System.out.println("Java Class");
		} else if (day == 1 || day == 5) {
			System.out.println(" No school");
		} else if (day == 3) {
			System.out.println("Review Class");
		} else {
			System.out.println(" not valid day");

			String weekDay = "Sunday";

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

}
