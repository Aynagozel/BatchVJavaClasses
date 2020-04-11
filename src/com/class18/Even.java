package com.class18;

public class Even {
    int a;
    
    void EvenOrOdd() {
        if(a%2==0) {
            System.out.println("This number is even");
        }else {
            System.out.println("This number is odd");
        }
    
    }
    
    public static void main(String[] args) {
        Even num=new Even();
        num.a=12;
        num.EvenOrOdd();

}
}