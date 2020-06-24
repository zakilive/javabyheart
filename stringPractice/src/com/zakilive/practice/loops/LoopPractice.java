package com.zakilive.practice.loops;
public class LoopPractice {

    public static void main(String[] args) {
        String string = "We have a large inventory of things in our warehouse falling in"+"this category:apperal and the slightly"+"more in demand category: makeup along with the category: furniture and __";
        printCategories(string);
    }

    public static void printCategories(String str) {
        int i = 0;
        while (true) {
            int found = str.indexOf("Category:", i);
            if (found == -1)
                break;
            int start = found + 9;
        }
    }
}


