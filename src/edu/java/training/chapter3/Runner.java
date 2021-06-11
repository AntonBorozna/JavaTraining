package edu.java.training.chapter3;

/*
        Создать классы, спецификации которых приведены ниже. Определить кон-
        структоры и методы setТип(), getТип(), toString(). Определить дополнительно
        методы в классе, создающем массив объектов. Задать критерий выбора данных
        и вывести эти данные на консоль. В каждом классе, обладающем информацией,
        должно быть объявлено несколько конструкторов.
        1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
        Факультет, Курс, Группа.
        Создать массив объектов. Вывести:
        a) список студентов заданного факультета;
        b) списки студентов для каждого факультета и курса;
        c) список студентов, родившихся после заданного года;
        d) список учебной группы.
 */

public class Runner {

    public static void main(String[] args) {
        StudentGroup studentList = new StudentGroup();
        studentList.fillStudents();
        Sorting.sortCourseGroup(studentList.getStudents(), "2", "Math", "3");
        System.out.println();
        Sorting.sortBirthday(studentList.getStudents(), "2000");
        System.out.println();
        Sorting.sortByFacultyAndGroup(studentList.getStudents());
        System.out.println();
        Sorting.sortFaculty(studentList.getStudents(), "IT");
    }
}
