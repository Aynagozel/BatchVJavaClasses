package com.class19;

public class weekDayName {
// * method will take a week day number
// and return a week day name
	
	String weekDayName(int weekDay) {
		String weekDayName;
		switch(weekDay) {
		case 1:
			weekDayName ="Monday";
			break;
		case 2:
			weekDayName ="Monday";
			break;
		case 3:
			weekDayName ="Monday";
			break;
		case 4:
			weekDayName ="Monday";
			break;
		case 5:
			weekDayName ="Friday";
			break;
		case 6:
			weekDayName ="Monday";
			break;
		case 7:
			weekDayName ="Monday";
			break;
		default:
			weekDayName="Unknown";
			
		}
		return weekDayName;
	}
	public static void main(String[] args) {
		 //call method weekdayname
		//if(tuesday, wednesday,thursday, sunday)--> I am learning java
		weekDayName obj=new weekDayName();
		
		String day=obj.weekDayName(5);
		System.out.println(day);
		if(day.equals("Tuesday")|| day.equals("Wednesday") || day.equals("Thursday")||day.equals("Friday")||day.equals("Saturday")||
				day.equals("Sunday")) {
		System.out.println("I am learning Java ");
	}else {
		System.out.println("I am practicing Java");
	}
}
}