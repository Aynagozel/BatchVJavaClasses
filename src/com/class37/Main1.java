package com.class37;

public class Main1{
	
	 public static void main(String[] args) {
	     try{ 
	            int a[] = {10,20,30};
	            System.out.println(a[4]);
	        } 
	        catch(ArrayIndexOutOfBoundsException e){ 
	            e.printStackTrace(); 
	        } 
	  }
	}
		
