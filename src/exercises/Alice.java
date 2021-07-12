package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        aliceLine = aliceLine.toLowerCase();
        System.out.println("What word would you like to search for in the opening sentence?  ");
        String word = input.next().toLowerCase();

        boolean answer = aliceLine.contains(word);
        int index = aliceLine.indexOf(word);
        int length = word.length();

        System.out.println(word + " is within the opening sentence?  " + answer);
        System.out.println(word + " is at index " + index + " of the opening sentence.");

        String wordVerified = aliceLine.substring(index, index+length);
        String aliceLineShorter = aliceLine.replace(word, "");
        System.out.println(wordVerified);

        System.out.println("The new sentence, without the word " + word + " is: " + aliceLineShorter);
    }



}
