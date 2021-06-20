package edu.java.training.chapter2.part_a;

import java.util.ArrayList;

/*
Ввести n чисел с консоли.
Найти самое короткое и самое длинное число. Вывести найденные числа
и их длину.
 */

public class ShortestLongest {

    public static void main(String[] args) {
    	ArrayList<String> numbers = new ArrayList<>();        
        String minString = null;
        String maxString = null;        
        int minLength = args[0].length();
        int maxLength = args[0].length();
        

        for (int i = 0; i < args.length; i++) {
        	try {
        		if(args[i].contains(".")) {
        			double number = Double.parseDouble(args[i]);
        			numbers.add(String.valueOf(number));
        		} else {
        			int number = Integer.parseInt(args[i]);
        			numbers.add(String.valueOf(number));
        		}
            }catch(Exception e){
            	System.out.println("Not a number: " + args[i]);
            	continue;
            }        	
            if (minLength >= args[i].length()) {                
                minString = numbers.get(i);
                minLength = args[i].length();
            }
            if (maxLength <= args[i].length()) {                
                maxString = numbers.get(i);
                maxLength = args[i].length();
            }                 
        }
        System.out.println("minimal number " + minString + " has length: " + minLength + ""
        		+ " Maximum number: " + maxString + " has length: " + maxLength);
    }

}
