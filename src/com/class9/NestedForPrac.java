package com.class9;

public class NestedForPrac {
	
	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				System.out.println(i+ "  " +j);{
			}
			
		}// 24 hours,60 minutes
			for(int h=0; h<24; h++) {
				for(int m=0; h<60; h++) {
					if(m<10) {
						System.out.println(h+":0");
					
					
				}else {
					System.out.println(h+":"+m);
				}
					
			}
		}
	}
	}
}

