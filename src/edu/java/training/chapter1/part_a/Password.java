package edu.java.training.chapter1.part_a;

/*
Ввести пароль из командной строки и сравнить его со строкой-образцом.
 */

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        String password = "12345";
        System.out.println("Enter Password");
        Scanner scanner = new Scanner(System.in);
        String userPass = scanner.next();

        if (userPass.equals(password)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
