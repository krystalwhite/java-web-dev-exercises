package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of the circle? ");
        double radius = input.nextDouble();

//        double area = radius * radius * Math.PI;
        double area = Circle.getArea(radius);
        System.out.println("Your circle with a radius of " + radius + " units has an approximate area of " + area + " units squared.");
    }
}
