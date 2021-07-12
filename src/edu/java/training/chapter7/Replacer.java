package edu.java.training.chapter7;
/*
Создать массив целых чисел. 
Убрать все четные элементы из массива и заполнить в конце нулями до прежнего размера массива.
 */

public class Replacer {	

	void replace() {
		int[] numbers = new int[] { 1, 2, 3, 44, 5, 6, 78, 88, 9, 10 };
		for (int i = 0; i < numbers.length; i++) {			
			if (numbers[i] % 2 == 0) {
				for (int j = i; j < numbers.length - 1; j++){
					numbers[j] = numbers[j + 1];
                }
				numbers[numbers.length - 1] = 0;
				if (numbers[i] != 0) i--;
			}			
		}
		for (int i = 0; i < numbers.length; i++)
		System.out.println(numbers[i]);
	}
}