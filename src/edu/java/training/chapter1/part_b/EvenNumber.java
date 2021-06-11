package edu.java.training.chapter1.part_b;

public class EvenNumber {

    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i < args.length; i++) {
            num = Integer.parseInt(args[i]);

            if (num % 2 != 0) {
                System.out.print(args[i]);
            }
        }
    }
}
