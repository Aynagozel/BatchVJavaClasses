package com.class23;

public class Employee1 {
	 String name;
	  String lastName;
	  int employeeId;
	  String startDate;
	  int salary;
	  
	  Employee1(){
	    
	  }
	  Employee1(String name1, String lastName1,int employeeId1, String Date1, int salary1){
	    name=name1;
	    lastName=lastName1;
	    employeeId=employeeId1;
	    startDate=Date1;
	    salary=salary1;
	    
	  }
	  void disPlay() {
	  System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
}
