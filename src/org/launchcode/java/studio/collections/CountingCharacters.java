package org.launchcode.java.studio.collections;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> list = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Type in some text please, and I will count how how many instances of each character you typed!");
        String text = input.nextLine();

//        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = text.toCharArray();

        for (int i = 0; i < charactersInString.length; i++) {
            Integer charCount = 0;
            for (int j = 0; j < charactersInString.length; j++) {
                if (charactersInString[i] == charactersInString[j]) {
                    charCount += 1;
                }
            }
            list.put(charactersInString[i], charCount);
        }

        for (Map.Entry<Character, Integer> c : list.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }
    }
}
