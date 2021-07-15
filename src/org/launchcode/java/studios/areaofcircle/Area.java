package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of the circle? ");
        double radius = input.nextDouble();
        while (radius <=0) {
            System.out.println("Please enter a positive number for the radius.");
            radius = input.nextDouble();
        }
        input.close();

//        double area = radius * radius * Math.PI;
        double area = Circle.getArea(radius);
        System.out.println("Your circle with a radius of " + radius + " units has an approximate area of " + area + " units squared.");

//        calling the calculateCircleArea method
        System.out.println("Your circle with a radius of " + radius + " units has an approximate area of " + calculateCircleArea(radius) + " units squared.");


//        different code attempt with studio partners
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the radius of the circle? ");
        String userRadius = userInput.nextLine();
        if (userRadius.equals("")) {
            System.out.println("You did not enter in a quantity.");
        }

        Double userRadiusNumber = Double.parseDouble(userRadius);

        System.out.println("Your circle with a radius of " + userRadiusNumber + " units has an approximate area of " + calculateCircleArea(userRadiusNumber) + " units squared.");
        userInput.close();


    }


    //        alternate path to write a new method
        public static double calculateCircleArea(double userRadius) {
            return Math.PI * userRadius * userRadius;
        }


}
