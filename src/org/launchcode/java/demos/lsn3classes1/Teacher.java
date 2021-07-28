package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName,
                   String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName (String aName) {
        firstName = aName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName (String aName) {
        lastName = aName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject (String aSubject) {
        subject = aSubject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching (int aTotal) {
        yearsTeaching = aTotal;
    }
}
