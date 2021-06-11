package edu.java.training.chapter1.part_a;

import java.util.*;

public class Randomizer {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int x = random.nextInt(50);
            System.out.println(x);
        }

        for (int i = 0; i < 50; i++) {
            int x = random.nextInt(50);
            System.out.print(x);
            System.out.print(" ");
        }
    }
}
