package com.zakilive;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String name, int weight, String gender) {
        super(name, weight, gender);
    }


    public void Fly(){
        System.out.println("Sparrow flying high....");
    }

}