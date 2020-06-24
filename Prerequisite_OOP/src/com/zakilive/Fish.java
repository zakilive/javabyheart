package com.zakilive;

public class Fish extends Animal {

    public Fish(String name, int weight, String gender) {
        super(name, weight, gender);
    }


    public void move() {
        System.out.println("Fish is swimming");
    }

    public void Swim() {
        System.out.println(name + " also Swimming...");
    }


    public static void moveAnimal() {

    }

}