package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class Course {

        private String courseTitle;
        private Teacher teacher;
        private ArrayList<Student> roster;
//        private HashMap<Student, Integer> rosterWithGradeLevel;  I thought to add in a HashMap that included Grade Level and then realized that this would be better placed as a field in the Student class
        private int numberOfStudents;
        private int lengthInSemesters;

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Course course = (Course) o;
                return courseTitle.equals(course.courseTitle) && teacher.equals(course.teacher);
        }

        @Override
        public int hashCode() {
                return Objects.hash(courseTitle, teacher);
        }

        public Course (String courseTitle, Teacher teacher, ArrayList<Student> roster, int numberOfStudents, int lengthInSemesters) {
                this.courseTitle = courseTitle;
                this.teacher = teacher;
                this.roster = roster;
//                this.rosterWithGradeLevel = rosterWithGradeLevel;
                this.numberOfStudents = numberOfStudents;
                this.lengthInSemesters = lengthInSemesters;
        }

        public String getCourseTitle() {
                return courseTitle;
        }

        public void setCourseTitle(String courseTitle) {
                this.courseTitle = courseTitle;
        }

        public Teacher getTeacher() {
                return teacher;
        }

        public void setTeacher(Teacher teacher) {
                this.teacher = teacher;
        }

        public ArrayList<Student> getRoster() {
                return roster;
        }

        public void setRoster(ArrayList<Student> roster) {
                this.roster = roster;
        }

        public int getNumberOfStudents() {
                return numberOfStudents;
        }

        public void setNumberOfStudents(int numberOfStudents) {
                this.numberOfStudents = numberOfStudents;
        }

        public int getLengthInSemesters() {
                return lengthInSemesters;
        }

        public void setLengthInSemesters(int lengthInSemesters) {
                this.lengthInSemesters = lengthInSemesters;
        }



        /*
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

         */
}
