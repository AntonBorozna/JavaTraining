package edu.java.training.chapter2.part_a;

/*
Ввести n чисел с консоли.
Найти самое короткое и самое длинное число. Вывести найденные числа
и их длину.
 */

public class ShortestLongest {

    public static void main(String[] args) {
        int[] num = new int[args.length];
        int min = args[0].length();
        int max = args[0].length();
        int minLength = args[0].length();
        int maxLength = args[0].length();

        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
            if (min >= num[i]) {
                min = num[i];
                minLength = args.length;
            }
            if (max <= num[i]) {
                max = num[i];
                maxLength = args.length;
            }
        }
        System.out.println(min + " " + minLength + " " + max + " " + maxLength);
    }

}
