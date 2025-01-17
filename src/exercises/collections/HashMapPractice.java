package exercises.collections;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer iDNumber;
        String newStudent;

        System.out.println("Input the student's ID number, hit enter, and then input the student's name. Input 000 to finish.");

        // Get student ID numbers and names
        do {
            System.out.print("ID Number: ");
            iDNumber = input.nextInt();
            input.skip("\n");

            if (!iDNumber.equals(000)) {
                System.out.print("Student: ");
                newStudent = input.nextLine();
                students.put(iDNumber, newStudent);
                input.nextLine();
            }

        } while(!iDNumber.equals(000));



        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> number : students.entrySet()) {
                System.out.println(number.getKey() + ": " + number.getValue());
        }




        input.close();
    }
}
