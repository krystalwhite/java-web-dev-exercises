package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive in this vehicle since you last fueled up? ");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gasoline did it take to fuel up your vehicle? ");
        double gallons = input.nextDouble();

        double mPG = miles / gallons;
        System.out.println("Your vehicle had " + mPG + " miles per gallon in this last period of time.");
        input.close();
    }
}
