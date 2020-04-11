package com.class18;

public class Task {
	void maximum(int a, int b) {
        int max;
        if (a>b) {
            max=a;
        }else {
            max=b;
        }
        System.out.println("The max num is " + max);
    }
    public static void main(String[] args) {
        Task max = new Task ();
        max.maximum(5,2);
        
        
        }
    }
    

