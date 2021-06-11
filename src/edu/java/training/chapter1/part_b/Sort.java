package edu.java.training.chapter1.part_b;

public class Sort {

    public static void main(String[] args) {
        int[] number = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            number[i] = Integer.parseInt(args[i]);
            System.out.print(number[i] + " ");
        }

        System.out.println();

        for (int l = 0; l < args.length; l++) {
            int min = number[l];
            int minID = l;
            for (int k = l + 1; k < args.length; k++) {
                if (min > number[k]) {
                    min = number[k];
                    minID = k;
                }
            }
            int temp = number[l];
            number[l] = min;
            number[minID] = temp;

            System.out.print(number[l] + " ");

        }

        System.out.println();

        for (int r = args.length - 1; r >= 0; r--) {
            System.out.print(number[r] + " ");
        }
    }
}
