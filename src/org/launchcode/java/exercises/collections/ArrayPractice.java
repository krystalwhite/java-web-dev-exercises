package org.launchcode.java.exercises.collections;

public class ArrayPractice {
    public static void main(String[] args) {
   int[] nums = {1, 1, 2, 3, 5, 8};

//        printing all numbers in the array
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

//        printing the odd numbers only
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] %2 == 1) {
                System.out.println(nums[j]);
            }
        }

        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] seussSplit = seuss.split(" ");
        for (int k = 0; k < seussSplit.length; k++) {
            System.out.println(seussSplit[k]);
        }

//        System.out.println(Arrays.toString(seussSplit);
        String [] seussSplitSentence = seuss.split("\\.");
        for (int k = 0; k < seussSplitSentence.length; k++) {
            System.out.println(seussSplitSentence[k]);
        }
    }
}
