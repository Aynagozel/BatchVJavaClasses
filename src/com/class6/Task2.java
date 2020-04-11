package com.class6;

public class Task2 {

	public static void main(String[] args) {

		int time =33;
		String timeOfDay=null;

		if (time >= 1 && time <= 11) {
			timeOfDay = "Morning";
			
		} else if (time >= 12 && time <= 15) {
			timeOfDay = "Noon";
			
		} else if (time >= 16 && time <= 20) {
			timeOfDay = "Evening";
			
		} else if (time >=20 && time<=24) {
			timeOfDay = "Night";
			
		} else {
			
			timeOfDay="invalid";
	
		}
		System.out.println("Time of the day " +timeOfDay);
	}

}
