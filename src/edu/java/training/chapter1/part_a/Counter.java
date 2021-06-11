package edu.java.training.chapter1.part_a;

/*
Ввести целые числа как аргументы командной строки, подсчитать их сум-
мы и произведения. Вывести результат на консоль.
 */

public class Counter {

    public static void main(String[] args) {
        int sum = 0;
        int multiple = 1;

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            sum += Integer.parseInt(args[i]);
            multiple *= Integer.parseInt(args[i]);
        }
        System.out.println(sum);
        System.out.println(multiple);
    }
}
