package edu.java.training.chapter1.part_b;

public class Determine {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 9 == 0 || num % 3 == 0) {
                System.out.print(args[i] + " ");
            }
        }

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 5 == 0 && num % 7 == 0) {
                System.out.print(args[i] + " ");
            }
        }
    }
}
