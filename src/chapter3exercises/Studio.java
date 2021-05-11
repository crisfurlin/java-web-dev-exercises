package chapter3exercises;

import java.util.HashMap;

public class Studio {
    public static void main(String[] args) {

        HashMap<Character, Integer> countingChars = new HashMap<>();
        String sentence = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] arraySentence = sentence.toCharArray();

        for (char i : arraySentence) {
            if (!countingChars.containsKey(i)) {
                countingChars.put(i, 1);
            } else {
                countingChars.put(i, countingChars.get(i) + 1);
            }
        }

        System.out.println(countingChars);
    }
}
