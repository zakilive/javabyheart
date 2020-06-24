package com.zakilive;

public class Bird extends Animal { //now bird is a child of Animal, Bird is a subclass and Animal is base class



    public Bird(String name, int weight, String gender)
    {
        super(name, weight, gender);
    }


    public void move() {
        System.out.println("Flapping wings");
    }


}
