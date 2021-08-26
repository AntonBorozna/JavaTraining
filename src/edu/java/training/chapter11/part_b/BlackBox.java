package edu.java.training.chapter11.part_b;

import java.util.Iterator;

/*
 * Реализовать структуру «черный ящик», хранящую множество чисел и имеющую
 * внутренний счетчик K, изначально равный нулю. Структура должна поддерживать
 * операции добавления числа в множество и возвращение K-го по минимальности
 * числа из множества.
 */

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class BlackBox {
	Set<Integer> numbers = new TreeSet<>();	

	public void fillBlackBox() {		
		
		Random rand = new Random();
		for (int i = 0; i < 50; i++) {
			numbers.add(rand.nextInt(99) + 1);
		}
		System.out.println(numbers + " \nsize: " + numbers.size());		
	}
	
	public void addNumber(int number) {
		numbers.add(number);
	}

	public void returnMinNumber(int k) {
		Integer[] num = new Integer[numbers.size()];
		numbers.toArray(num);
		for (int i = 0; i < num.length; i++) {
			if (i == k) {
				System.out.println(num[i-1]);
			} else {
				System.out.println("There's no such number");
				break;
			}
		}
	}
}
