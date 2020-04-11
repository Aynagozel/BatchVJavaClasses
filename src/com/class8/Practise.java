package com.class8;

public class Practise {
	
	public static void main(String[] args) {
	
		for(int i =100; i>=1; i-- ) {
			System.out.println(i);
		}
	for(int i=0; i<=50; i+=5) {
		System.out.println(i);
	}
	for(int i=0; i<=4;   i++) {
		System.out.println("Good morning");
	}
	for(int i=1; i<=20; i+=2) {
		System.out.println(i);
	}
	for (int i = 20; i<=50; i++) {
		if (i % 2 == 1)
			System.out.println(i);
	}
	int sum=0;
	for(int i = 1; i <= 5; i ++) {
		sum=sum +i;
		System.out.println(sum);
	}
	//System.out.println(sum);
	int sumAll=0;
	for(int i=0; i<=20; i+=5) {//0,5,15,20
		sumAll=sumAll+i;
		System.out.println(sumAll);
	}
	int total=2;
	for(int y=1; y<=3; y++) {
		total=total*y; // 2=2*1; 4=2*2; 12=4*3
	}
	System.out.println(total);
}
}
