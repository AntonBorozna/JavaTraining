package edu.java.training.chapter1.part_b;

public class SimpleNum {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            int counter = 0;
            for (int k = num; k > 1; k--) {
                if (num % k == 0) {
                    counter++;
                }
            }
            if (counter == 1) {
                System.out.println(num);
            }
        }
    }
}
