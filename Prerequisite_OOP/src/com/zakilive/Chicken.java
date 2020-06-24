package com.zakilive;

public class Chicken extends Bird{


    public Chicken(String name, int weight, String gender) {
        super(name, weight, gender);
    }

    public void fly(){
        System.out.println("not able to fly....");
    }

}
