package edu.java.training.chapter1.part_b;

public class ThreeDigitNumbers {


    public static void main(String[] args) {
        for (String arg : args) {
            if (arg.length() == 3) {
                char ch1 = arg.charAt(0);
                char ch2 = arg.charAt(1);
                char ch3 = arg.charAt(2);
                if (ch1 != ch2 && ch1 != ch3 && ch2 != ch3) {
                    System.out.println(arg);
                }
            }
        }
    }
}

