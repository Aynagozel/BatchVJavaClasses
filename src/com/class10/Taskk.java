package com.class10;

import java.lang.reflect.Array;

public class Taskk {
	
	public static void main(String[] args) {
		
		char[]grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println("Grade "+grade[1]);
	
		char[]grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		int a=1;
		System.out.println(grade[a]);
		
		//System.out.println(grades[0]);
		//System.out.println(grades[1]);
		//System.out.println(grades[2]);
		//System.out.println(grades[3]);
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
			
			
			String[]name= {"Kenuil", " Ayna ", "Fadime ", "Omer", "Murat", "Mananna", " Cihan"};
			char a1=1;
			System.out.println(name[a1]);
			
			String[]name1=new String[2];
			name[0]="Kenuil";
			name[1]="Ayna";
			name[2]="Fadime";
			System.out.println(name[1]);
			
			String[]day= {"Days", " Saturday is Java coding day"};
			int a2=1;
			
			System.out.println(day[a1]);
			
		}
		
		
	}
}
