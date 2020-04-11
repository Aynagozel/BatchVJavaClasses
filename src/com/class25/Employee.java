package com.class25;

public class Employee {
	
	public static String companyName;//accessible though the project
	int salary;//accesible within same package
	protected int employeeId;
	private String employeeSsn; // accesible with in same class

	void work() {
		System.out.println("I work" + companyName+ "company");
	}
	void getPaid() {
		System.out.println("I get paid "+salary);
	}
}
