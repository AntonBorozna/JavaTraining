package edu.java.training.chapter11.part_b;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета по
 * кругу вычеркивается каждый второй человек, пока не останется один. Составить
 * две программы, моделирующие процесс. Одна из программ должна использовать
 * класс ArrayList, а вторая — LinkedList. Какая из двух программ работает
 * быстрее? Почему?
 */

public class Kicker {
	long startTime = System.nanoTime();	

	public void removeEverySecondArray(int n) {
		long startTime = System.nanoTime();
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			numbers.add(i);
		}
		int counter = 1;
		int lastValue = numbers.get(numbers.size() - 1);
		while (counter < numbers.size()) {
			numbers.remove(counter);
			counter++;
		}
		while (numbers.size() != 1) {
			if (lastValue == numbers.get(numbers.size() - 1)) {
				counter = 0;
				while (counter < numbers.size()) {
					numbers.remove(counter);
					counter++;
				}
			} else {
				counter = 1;
				lastValue = numbers.get(numbers.size() - 1);
				while (counter < numbers.size()) {
					numbers.remove(counter);
					counter++;
				}
			}
		}
		System.out.println(numbers);
		long endTime = System.nanoTime();
		System.out.println("Duration of ArrayList stack solution: " + (endTime - startTime));
	}

	public void removeEverySecondLinked(int n) {
		long startTime = System.nanoTime();
		List<Integer> numbers = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			numbers.add(i);
		}
		int counter = 1;
		int lastValue = numbers.get(numbers.size() - 1);
		while (counter < numbers.size()) {
			numbers.remove(counter);
			counter++;
		}
		while (numbers.size() != 1) {
			if (lastValue == numbers.get(numbers.size() - 1)) {
				counter = 0;
				while (counter < numbers.size()) {
					numbers.remove(counter);
					counter++;
				}
			} else {
				counter = 1;
				lastValue = numbers.get(numbers.size() - 1);
				while (counter < numbers.size()) {
					numbers.remove(counter);
					counter++;
				}
			}
		}
		System.out.println(numbers);
		long endTime = System.nanoTime();
		System.out.println("Duration of LinkedList stack solution: " + (endTime - startTime));
	}

	

}
