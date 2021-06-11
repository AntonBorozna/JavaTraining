package edu.java.training.chapter1.part_b;

/*
Ввести с консоли n целых чисел. На консоль вывести:
2. Наибольшее и наименьшее число.
*/

public class MinMax {

    public static void main(String[] args) {
        int[] num = new int[args.length];
        num[0] = Integer.parseInt(args[0]);
        int min = num[0];
        int max = num[0];

        for (int i = 1; i != args.length; i++) {
            num[i] = Integer.parseInt(args[i]);

            if (num[i] > max) {
                max = num[i];
            }

            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
