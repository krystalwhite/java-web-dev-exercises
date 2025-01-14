package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

     // Determine the grade level of the student based on numberOfCredits
//    should not be static because it depends on the instance data
//    public static String getGradeLevel(int creditsCompleted) {
//        String gradeLevel = "Freshman";
//        if (creditsCompleted >= 0 && creditsCompleted < 30) {
//            gradeLevel = "Freshman";
//        } else if (creditsCompleted >= 30 && creditsCompleted < 60) {
//            gradeLevel = "Sophomore";
//        } else if (creditsCompleted >= 60 && creditsCompleted < 90) {
//            gradeLevel = "Junior";
//        } else if (creditsCompleted >= 90) {
//            gradeLevel = "Senior";
//        }
//        return gradeLevel;
//    }


//    make it an instance method because it depends on the data of the object to determine the grade level
    public String getGradeLevel() {
        String gradeLevel = "Freshman";
        if (this.numberOfCredits < 30) {
            gradeLevel = "Freshman";
        } else if (this.numberOfCredits >= 30 && this.numberOfCredits < 60) {
            gradeLevel = "Sophomore";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits < 90) {
            gradeLevel = "Junior";
        } else if (this.numberOfCredits >= 90) {
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }


    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;
        double singleAddedQualityScore = courseCredits * grade;
        double updatedTotalQualityScore = currentTotalQualityScore + singleAddedQualityScore;
        this.numberOfCredits += courseCredits;
        this.gpa = updatedTotalQualityScore / this.numberOfCredits;
    }



    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.



    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

//    public static void main(String[] args) {
//        Student sally = new Student("Sally",1,1,4.0);
//        System.out.println("The Student class works! " + sally.getName() + " is a student!");
//        System.out.println(sally);
//        sally.addGrade(12, 3.5);
//        System.out.println(sally);
//        sally.addGrade(25, 3.8);
//        System.out.println(sally);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    @Override
    public String toString() {
        String reply = name + ", a student with ID number " + studentId + ", has earned " + numberOfCredits + " credits and a " + gpa + " GPA.";
        return reply;
    }
}
