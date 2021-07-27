package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;


public class Course {

        private String courseTitle;
        private Teacher teacher;
        private ArrayList<Student> roster;
//        private HashMap<Student, Integer> rosterWithGradeLevel;  I thought to add in a HashMap that included Grade Level and then realized that this would be better placed as a field in the Student class
        private int numberOfStudents;
        private int lengthInSemesters;

        public Course (String courseTitle, Teacher teacher, ArrayList<Student> roster, int numberOfStudents, int lengthInSemesters) {
                this.courseTitle = courseTitle;
                this.teacher = teacher;
                this.roster = roster;
//                this.rosterWithGradeLevel = rosterWithGradeLevel;
                this.numberOfStudents = numberOfStudents;
                this.lengthInSemesters = lengthInSemesters;
        }

//        Course getters
        protected String getCourseTitle() {
                return courseTitle;
        }

        protected Teacher getTeacher() {
                return teacher;
        }

        protected ArrayList<Student> getRoster() {
                return roster;
        }

        protected int getNumberOfStudents() {
                return numberOfStudents;
        }

        protected int getLengthInSemesters() {
                return lengthInSemesters;
        }

//        Course setters
        protected void setCourseTitle(String aTitle) {
                courseTitle = aTitle;
        }

        protected void setTeacher(Teacher aTeacher) {
                teacher = aTeacher;
        }

        protected void setRoster(ArrayList<Student> aRoster) {
                roster = aRoster;
        }

        protected void setNumberOfStudents(int aNumber) {
                numberOfStudents = aNumber;
        }

        protected void setLengthInSemesters(int aLength) {
                lengthInSemesters = aLength;
        }
}
