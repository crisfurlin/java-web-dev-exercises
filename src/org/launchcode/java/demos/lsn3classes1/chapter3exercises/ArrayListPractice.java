package org.launchcode.java.demos.lsn3classes1.chapter3exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> someInts = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        String myString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String [] myStringArray = myString.split(" ");

        System.out.println("How many letters? ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        System.out.println(sumEven(someInts));
        printFive(myStringArray, length);
    }
    public static int sumEven(ArrayList<Integer> arr) {
        Integer sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    public static void printFive(String [] arr, int length) {
        for (String word : arr) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
