package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;


//    constructor
    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

//    overloading constructor, allows two default values to be given AND not have to send all parameters
   /* public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }*/

//    third and better overloaded constructor is this one
//    the "this()" portion invokes another constructor within the same class
//    public Student(String name, int studentId) {
//     this(name, studentId, 0, 0);
//}


//    getters and setters for the class
    protected String getName() {
        return name;
    }

    protected void setName (String aName) {
        name = aName;
    }

    protected int getStudentId() {
        return studentId;
    }

    protected void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    protected int getNumberOfCredits() {
        return numberOfCredits;
    }

    protected void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    protected double getGpa() {
        return gpa;
    }

    protected void setGpa(double aGpa) {
        gpa = aGpa;
    }


}