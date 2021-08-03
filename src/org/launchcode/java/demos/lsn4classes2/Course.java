package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher professor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher professor) {
        this.topic = topic;
        this.professor = professor;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public org.launchcode.java.demos.lsn4classes2.Teacher getProfessor() {
        return professor;
    }

    public void setProfessor(org.launchcode.java.demos.lsn4classes2.Teacher professor) {
        this.professor = professor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public String toString() {
        String reply = "The class, " + topic + ", taught by " + professor + ", has these students: " + enrolledStudents;
        return reply;
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(topic, course.topic) && Objects.equals(professor, course.professor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, professor);
    }
}
