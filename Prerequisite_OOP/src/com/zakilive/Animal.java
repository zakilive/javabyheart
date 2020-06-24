package com.zakilive;

public abstract class Animal {
    //defining attributes
    String name;
    int weight;
    String gender;

    public Animal(String name, int weight, String gender){   //defining constructors
        this.name=name;
        this.weight=weight;
        this.gender=gender;
    }

    //behaviours

    public void Eat(){
        System.out.println(name+" eat");
    }

    public void Sleep(){
        System.out.println(name+" Sleep");
    }

    public abstract void move(); //You cannot create instance of a abtract class


}