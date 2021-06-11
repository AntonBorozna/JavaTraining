package edu.java.training.chapter1.part_b;

/*
Ввести с консоли n целых чисел. На консоль вывести:
1.Четные и нечетные числа.
 */

public class EvenNumber {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 2 != 0) {
                System.out.print(args[i]);
            }
        }
    }
}
