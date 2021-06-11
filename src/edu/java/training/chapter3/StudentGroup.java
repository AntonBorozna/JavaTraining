package edu.java.training.chapter3;


public class StudentGroup {

    private Student[] students = new Student[6];

    public void fillStudents() {
        students[0] = new Student("Alex", "Jonson", "10.02.2000", "Kalinovsky st.21", "123456", "3", "IT", "2");
        students[1] = new Student("Jim", "Morrison", "02.01.1999", "Wall st.11", "6549874", "4", "Math", "2");
        students[2] = new Student("Liza", "Fisher", "05.03.1998", "Richmond av.12", "654558", "5", "IT", "1");
        students[3] = new Student("Bill", "Sith", "06.12.2000", "Korusant st. 1", "3216544", "3", "Math", "2");
        students[4] = new Student("Thomas", "Pipka", "01.01.2002", "Utiputi st.7", "9876542", "3", "IT", "1");
        students[5] = new Student("Adam", "Grick", "15.08.1998", "Lipki st.11", "3216587", "3", "Math", "1");
    }

    public Student[] getStudents() {
        return students;
    }
}
