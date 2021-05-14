package org.launchcode.java.demos.lsn3classes1.exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userTerm;
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String aliceLower = aliceSentence.toLowerCase();

        System.out.println("Enter a term to search:");
        userTerm = input.nextLine();
        String userLower = userTerm.toLowerCase();

        if (aliceLower.contains(userLower)) {
            System.out.println("Your term was found in Alice.");
            System.out.println("Word's index in sentence: " + aliceLower.indexOf(userLower));
            String newAlice = aliceLower.replace(userLower, "");
            System.out.println(newAlice);
        } else {
            System.out.println("Your term wasn't found in Alice.");
        }

    }
}
