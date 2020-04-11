package com.class17;

public class Dog {
	String name1, name2,name3;
 void playGames() {
        
        System.out.println("He is very playfull "+name1);
        System.out.println("He is very playfull "+name2);
        System.out.println("He is very playfull "+name3);
    }
    void personality() {
        System.out.println("He can be independent "+name1);
        System.out.println("He can be dependent "+name2);
        System.out.println("He can be independent "+name3);
    }
    
    public static void main(String[] agrs) {
        Dog dog1=new Dog();
        dog1.name1="Husky";
        dog1.name2="Bulldog";
        dog1.name3="Labrador";
        System.out.println("I have three dogs "+dog1.name1+" "+dog1.name2+" "+dog1.name3);
        dog1.playGames();
        dog1.personality();
}
}
