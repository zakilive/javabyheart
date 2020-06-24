package com.zakilive;

public class StringPractice {
    public static void main(String[] args) {

//        String str="ABCDEFG";
//        String extractedString=str.substring(0,2);
//
//        System.out.println(extractedString);
//
//        String a="hello";
//        String b="there";
//
////        if(a=="hello")
////        {
////            //this is A TRAP!!! don't use this
////        }
//
//        if(a.equals("hello"))
//        {
//            //USE this
//            System.out.println("Zaki");
//        }
//        if(b.equalsIgnoreCase("There"))
//        {
//            System.out.println("Printed there");
//        }


//        System.out.println(a.charAt(-1));
//
//        char myChar="H";
//        char myChar="}";
//        char myChar="0";


        String str1="Hello yogi there yogi";
        int a1=str1.indexOf("yogi",0);
        int b=str1.lastIndexOf(" yogi");
        System.out.println(b);


        String a="Hello";
        System.out.println(a.charAt(-1));
    }
}
