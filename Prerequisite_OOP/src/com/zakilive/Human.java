package com.zakilive;

public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name,int age,int heightInInches,String eyeColor){ //special method/construcotr method same name as class, constructor has no return type
        this.age=age;   //this is a variable which is making it dynamic when it puts
        this.heightInInches=heightInInches;
        this.eyeColor=eyeColor;
        this.name=name;
    }

    public void Speak(){
        System.out.println("Hello, my name is "+name);
        System.out.println("I am "+heightInInches+" inches tall");
        System.out.println("I am "+age+" years old");
        System.out.println("My eye color is "+eyeColor);
        System.out.println("\n");
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void work(){
        System.out.println("Working....");
    }

}