package edu.java.training.chapter3;

public class Student {

    private String firstName;
    private String lastName;
    private String birthday;
    private String address;
    private String phoneNum;
    private String course;
    private String faculty;
    private String group;

    public Student(String firstName, String lastName, String birthday, String address, String phoneNum, String course, String faculty, String group){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNum = phoneNum;
        this.course = course;
        this.faculty = faculty;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getCourse(){
        return course;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName + " Birthday: " + birthday + " Private Data: " + address + " "
                + phoneNum + " Course: " + course + " Facility: " + faculty + " Group: " + group + ".";
    }

}
