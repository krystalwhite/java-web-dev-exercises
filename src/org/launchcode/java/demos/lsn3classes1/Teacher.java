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

    protected String getFirstName() {
        return firstName;
    }

    protected void setFirstName (String aName) {
        firstName = aName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setLastName (String aName) {
        lastName = aName;
    }

    protected String getSubject() {
        return subject;
    }

    protected void setSubject (String aSubject) {
        subject = aSubject;
    }

    protected int getYearsTeaching() {
        return yearsTeaching;
    }

    protected void setYearsTeaching (int aTotal) {
        yearsTeaching = aTotal;
    }
}
