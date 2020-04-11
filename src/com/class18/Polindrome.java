package com.class18;

public class Polindrome {
	  String original,reversed;
	    
	    void polind() {
	        
	        
	         if(original.equals(reversed)) {
	             System.out.println("String is palindrome");
	         }else {
	             System.out.println("String is not  palindrome");
	         }
	    }
	    public static void main(String[] args) {
	        
	        Polindrome name=new Polindrome();
	        name.original="Mom";
	        name.reversed="Mom";
	        name.polind();
}
}