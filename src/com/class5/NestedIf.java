package com.class5;

public class NestedIf {
	
	public static void main(String[] args) {
		
		boolean isDisplayed=true;
		String buttonText="Sing in";
		
		if(isDisplayed) {
			System.out.println("Button is displayed");
			if(buttonText.equals("Sing in")) {
				System.out.println("Test case pass");
			}else {
				System.out.println(" Wrong text is displayed");
			
				
			}
		
		}
		
	}
}
