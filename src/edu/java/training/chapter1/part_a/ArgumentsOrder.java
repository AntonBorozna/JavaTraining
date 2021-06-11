package edu.java.training.chapter1.part_a;

/*
Отобразить в окне консоли аргументы командной строки в обратном по-
рядке.
 */

public class ArgumentsOrder {

    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}
