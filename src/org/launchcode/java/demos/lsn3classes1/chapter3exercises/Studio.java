package org.launchcode.java.demos.lsn3classes1.chapter3exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Studio {
    public static void main(String[] args) {

        HashMap<Character, Integer> countingChars = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String sentence;

        System.out.println("Type in a sentence: ");
        sentence = input.nextLine().toLowerCase();

        char[] arraySentence = sentence.toCharArray();

        for (char i : arraySentence) {
            if (Character.isAlphabetic(i)) {
                if (!countingChars.containsKey(i)) {
                    countingChars.put(i, 1);
                } else {
                    countingChars.put(i, countingChars.get(i) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> eachChar : countingChars.entrySet()) {
            System.out.println(eachChar.getKey() + ": " + eachChar.getValue());
        }
    }
}
