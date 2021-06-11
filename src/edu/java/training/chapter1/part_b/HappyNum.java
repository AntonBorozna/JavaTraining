package edu.java.training.chapter1.part_b;

public class HappyNum {

    public static void main(String[] args) {
        for (String arg : args) {
            int[] num = new int[arg.length()];
            char[] ch = new char[arg.length()];

            for (int i = 0; i < arg.length(); i++) {
                ch[i] = arg.charAt(i);
                num[i] = Character.getNumericValue(ch[i]);
            }

            int sum = num[0] * num[0] + num[1] * num[1];
            while (sum != 1) {
                num[0] = sum / 10;
                num[1] = sum % 10;
                sum = num[0] * num[0] + num[1] * num[1];
            }
            System.out.println(arg);
        }
    }
}