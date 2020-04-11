package com.class18;

public class Numbers {
int a,b;
    
    void compareNums(){
        if(a>b) {
            System.out.println(a+" is bigger");
        }else {
            System.out.println(b+" is bigger");
        }
    }
    
    public static void main(String[] args) {
        
        Numbers num=new Numbers();
        
        num.a=3;
        num.b=9;
       num.compareNums();
}
}