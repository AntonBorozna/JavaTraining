package edu.java.training.chapter1.part_a;

/*
Приветствовать любого пользователя при вводе его имени через команд-
ную строку.
 */

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Enter Name");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello " + userName);
    }
}
