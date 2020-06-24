package com.zakilive.practice.loops;

public class NestedLoop {
    public static void main(String[] args) {
        int counter=0;
        for(int idx=0;idx<100;idx++)
        {
            for(int j=0;j<100;j++)
            {
                System.out.println("the value of idx was "+idx+"........"+j+"......");
            }
            System.out.println("COUNTER: "+counter++);
        }
    }
}
