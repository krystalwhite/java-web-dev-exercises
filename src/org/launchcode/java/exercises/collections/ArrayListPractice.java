package org.launchcode.java.exercises.collections;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();

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
    }
}
