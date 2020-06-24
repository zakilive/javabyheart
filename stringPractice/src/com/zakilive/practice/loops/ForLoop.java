package com.zakilive.practice.loops;

public class ForLoop {
    public static void main(String[] args) {
        int counter=0;
        for(int i=0; i<=100; i=i+1)
        {
            System.out.println(i);
            int temp=counter+1;
            counter=temp;
        }
    }

}
