package com.class23;

public class Syntax {
	public static void main(String[]args){
		  
		  SyntaxTechnologies d1=new SyntaxTechnologies();
		  SyntaxTechnologies d2=new SyntaxTechnologies("Syntax",4,"2019","07/30/2019");
		 
		System.out.println(d1.schoolName+" "+d1.batch+" "+d1.year+" "+ d1.lastDayOfClass);
		System.out.println(d2.schoolName+" "+d2.batch+" "+d2.year+" "+ d2.lastDayOfClass);
		
		}
}
