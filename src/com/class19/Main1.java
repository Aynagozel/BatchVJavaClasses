package com.class19;

public class Main1 {
	 int sum(int num1, int num2){
		    int c=num1+num2;
		    return c;
		  }
		  int mult(int num1, int num2){
		    int a=num1*num2;
		    return a;
		    
		  }
		  int sub(int num1, int num2){
		    int b=num1-num2;
		    return b;
		  }
		  public static void main(String[]args){
			    Main1 obj=new Main1();
			    int sum=obj.sum(15,15);
			    System.out.println(sum);
			    int mult=obj.mult(5,6);
			    System.out.println(mult);
			    int sub=obj.sub(30,10);
			    System.out.println(sub);
			  }
			}

