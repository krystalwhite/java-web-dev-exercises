package org.launchcode.java.exercises.collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();

//        creating an Integer ArrayList of numbers 0 through 12
        for (int i = 0; i < 13; i++){
            numbers.add(i);
        }

//        find the sum of all even numbers in Array List
        int sumEvens = 0;
        for (int j : numbers) {
            if (numbers.get(j) % 2 == 0) {
                sumEvens += numbers.get(j);
            }
        }
        System.out.println("The sum of all the even numbers in the ArrayList is " + sumEvens + ".");

//        creating a String ArrayList of a random words
        ArrayList <String> wordList = new ArrayList<>();
        String[] words = {"words", "containing", "five", "letters", "yahoo"};

        for (int i = 0; i < words.length; i++) {
            wordList.add(words[i]);
        }
//        System.out.println(wordList);

//        asking user how many letters and then printing out all words from an ArrayList of Strings that contain that many letters
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters would you like in your word?  ");
        int totalLetters = input.nextInt();

        for (String j : wordList)
            if (j.length() == totalLetters) {
                System.out.println(j);
            }

        input.close();
        
//        this code block doesn't work because List and Arrays don't work
//        List<String> words = Arrays.asList("words", "containing", "five", "letters", "yahoo");
//        wordList.addAll(words);




    }
}
