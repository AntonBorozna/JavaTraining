package edu.java.training.chapter11.part_a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class CollectionTasks {

	/*
	 * Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут
	 * в обратном порядке
	 */

	public void getReversOrder() {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Enter Number");
		Scanner scanner = new Scanner(System.in);
		String enteredNumber = scanner.next();
		char[] array = enteredNumber.toCharArray();
		int numbers[] = new int[enteredNumber.length()];
		for (int i = 0; i < enteredNumber.length(); i++) {
			numbers[i] = array[i] - '0';
			stack.push(numbers[i]);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	/*
	 * Задать два стека, поменять информацию местами
	 */

	public void swithcStack() {
		Stack<Integer> firstStack = new Stack<Integer>();
		Stack<Integer> secondStack = new Stack<Integer>();
		firstStack.push(1);
		firstStack.push(2);
		firstStack.push(3);
		secondStack.push(7);
		secondStack.push(8);
		secondStack.push(9);
		System.out.println("FirstStack: " + firstStack + " SecondStack: " + secondStack);
		Stack<Integer> tempSteck = firstStack;
		firstStack = secondStack;
		secondStack = tempSteck;
		System.out.println("FirstStack: " + firstStack + " SecondStack: " + secondStack);
	}

	/*
	 * Сложить два многочлена заданной степени, если коэффициенты многочленов
	 * хранятся в объекте HashMap.
	 */

	public void sum(int degree) {
		HashMap<Integer, Integer> firstCoefficient = new HashMap<Integer, Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("D(x)= d0 ");
		for (int i = 1; i <= degree; i++) {
			System.out.print(" + d" + i + "*x^" + i);
		}
		System.out.println();
		for (int i = 0; i <= degree; i++) {
			System.out.print("d" + i + "=");
			firstCoefficient.put(i, scanner.nextInt());
		}
		System.out.print("D(x)= " + firstCoefficient.get(0));
		for (int i = 1; i <= degree; i++) {
			System.out.print(" + " + firstCoefficient.get(i) + "x^" + i);
		}
		System.out.println();
		HashMap<Integer, Integer> secondCoefficient = new HashMap<Integer, Integer>();
		System.out.print("E(x)= e0 ");
		for (int i = 1; i <= degree; i++) {
			System.out.print(" + e" + i + "*x^" + i);
		}
		System.out.println();
		for (int i = 0; i <= degree; i++) {
			System.out.print("e" + i + "=");
			secondCoefficient.put(i, scanner.nextInt());
		}
		System.out.print("E(x)= " + secondCoefficient.get(0));
		for (int i = 1; i <= degree; i++) {
			System.out.print(" + " + secondCoefficient.get(i) + "x^" + i);
		}
		System.out.println();
		HashMap<Integer, Integer> sumCoefficient = new HashMap<Integer, Integer>();
		sumCoefficient.put(0, firstCoefficient.get(0) + secondCoefficient.get(0));
		System.out.print("D(x)+E(x)= " + sumCoefficient.get(0));
		for (int i = 1; i <= degree; i++) {
			sumCoefficient.put(i, firstCoefficient.get(i) + secondCoefficient.get(i));
			System.out.print(" + " + sumCoefficient.get(i) + "x^" + i);
		}

	}

	/*
	 * Ввести строки из файла, записать в список ArrayList. Выполнить сортировку
	 * строк, используя метод sort() из класса Collections.
	 */

	public List<String> splitString(String text) {
		List<String> textToFormat = Arrays.stream(text.split("\r\n")).collect(Collectors.toList());
		Collections.sort(textToFormat);
		return textToFormat;
	}

	/*
	 * Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых
	 * ключ>5. Если ключ = 0, вывести строки через запятую. Перемножить все ключи,
	 * где длина строки>5.
	 */

	public void mapFunction() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "null");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(10, "ten");
		map.put(42, "forty-two");
		int multiple = 1;
		System.out.println("Key > 5:\n");
		for (Map.Entry<Integer, String> item : map.entrySet()) {
			if (item.getKey() > 5) {
				System.out.println(item.getValue());
				multiple *= item.getKey();
			}
		}
		System.out.println("\nKey = 0");
		for (Map.Entry<Integer, String> item : map.entrySet()) {
			if (item.getKey() == 0) {
				System.out.println(map.values());
			}
		}
		System.out.println("\n" + "multiple keys: " + multiple);
	}

	/*
	 * Задан файл с текстом на английском языке. Выделить все различные слова.
	 * Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать
	 * класс HashSet.
	 */

	public void getIdentificalWords(String text) {
		List<String> textToFormat = Arrays.stream(text.toLowerCase().split("\\s+")).collect(Collectors.toList());
		HashSet<String> set = new HashSet<>();
		for (String words : textToFormat) {
			set.add(words);
		}
		System.out.println(set);
	}

	/*
	 * Ввести строки из файла, записать в список. Вывести строки в файл в обратном
	 * порядке.
	 */

	public List<String> getReversString(String text) {
		List<String> textToFormat = Arrays.stream(text.split("\r\n")).collect(Collectors.toList());
		Collections.reverse(textToFormat);
		return textToFormat;
	}
}
