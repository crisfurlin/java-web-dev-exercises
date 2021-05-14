package org.launchcode.java.demos.lsn3classes1.chapter3exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] myValues = {1, 1, 2, 3, 5, 8};
//        for (int value : myValues) {
//            System.out.println(value);
//        }
        for (int value : myValues) {
            if (value % 2 !=0) {
                System.out.println( value);
            }
        }

        String myString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String [] myStringArray = myString.split(" ");
        System.out.println(Arrays.toString(myStringArray));
    }
}
