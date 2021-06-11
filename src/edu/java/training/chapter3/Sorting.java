package edu.java.training.chapter3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Sorting {

    public static void sortFaculty(Student[] students, String thisFaculty) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(thisFaculty)) {
                System.out.println(students[i].toString());
            }
        }
    }

    public static void sortByFacultyAndGroup(Student[] students) {
        System.out.println("Faculty IT");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals("IT")) {
                System.out.println(students[i].toString());
            }
        }
        System.out.println("Faculty Math");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals("Math")) {
                System.out.println(students[i].toString());
            }
        }
        System.out.println("Course: 1");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getCourse().equals("1")) {
                System.out.println(students[i].toString());
            }
        }
        System.out.println("Course: 2");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getCourse().equals("2")) {
                System.out.println(students[i].toString());
            }
        }
        System.out.println("Course: 3");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getCourse().equals("3")) {
                System.out.println(students[i].toString());
            }
        }
        System.out.println("Course: 4");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getCourse().equals("4")) {
                System.out.println(students[i].toString());
            }
        }
        System.out.println("Course: 5");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getCourse().equals("5")) {
                System.out.println(students[i].toString());
            }
        }
    }

    public static void sortBirthday(Student[] students, String thisBirthday) {
        SimpleDateFormat dateFormatStudent = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat dateFormatThis = new SimpleDateFormat("yyyy");
        Date convertedDateStudent = new Date();
        Date convertedDateThis = new Date();
        for (int i = 0; i < students.length; i++) {
            try {
                convertedDateStudent = dateFormatStudent.parse(students[i].getBirthday());
                convertedDateThis = dateFormatThis.parse(thisBirthday);
            } catch (ParseException e) {
                System.out.println("Error");
            }
            if (convertedDateStudent.after(convertedDateThis)) {
                System.out.println(students[i].toString());
            }
        }
    }

    public static void sortCourseGroup(Student[] students, String thisGroup, String thisFaculty, String thisCource) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup().equals(thisGroup) && students[i].getFaculty().equals(thisFaculty) && students[i].getCourse().equals(thisCource)) {
                System.out.println(students[i].toString());
            }
        }
    }
}



