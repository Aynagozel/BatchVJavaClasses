package com.class19;

public class Main2 {
		 static String makeThreeSubstr(String word, int startIndex, int endIndex) {
			String str=word.substring(startIndex,endIndex);
			return str+str+str;
			
			  }
			 public static void main(String[]args){
			    System.out.println(makeThreeSubstr("hello", 2,0));
			    System.out.println(makeThreeSubstr("shenanigans",3,7));
			
			 
			 }
		}

