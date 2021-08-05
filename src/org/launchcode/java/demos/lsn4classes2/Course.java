package org.launchcode.java.demos.lsn4classes2;

//import org.launchcode.java.demos.lsn4classes2.Teacher;
//import exercises.classesAndObjects.school.Teacher;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public org.launchcode.java.demos.lsn4classes2.Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(org.launchcode.java.demos.lsn4classes2.Teacher instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        String reply = "The class, " + topic + ", taught by " + instructor.getFirstName() + " " + instructor.getLastName() + ", has these students: " + enrolledStudents;
        return reply;
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


    @Override
    public boolean equals(Object objectToBeCompared) {
        if (this == objectToBeCompared) {
            return true;
        }
        if (objectToBeCompared == null) {
            return false;
        }
        if (this.getClass() != objectToBeCompared.getClass())  {
            return false;
        }
//        the (Course) notation is casting the object to become a Course
        Course newCourse = (Course) objectToBeCompared;
        if (this.topic == newCourse.getTopic() && this.instructor == newCourse.getInstructor()) {
         return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor);
    }



}