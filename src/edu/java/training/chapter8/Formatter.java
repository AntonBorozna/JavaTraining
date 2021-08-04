package edu.java.training.chapter8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Formatter {

	/*
	 * В каждом слове текста k-ю букву заменить заданным символом. Если k больше
	 * длины слова, корректировку не выполнять
	 */

	public List<String> replaceChar(String text, char symbal, int k) {
		return Arrays.stream(text.split("\\s+")).map(s -> {
			if (s.length() >= k) {
				StringBuilder o = new StringBuilder(s);
				o.setCharAt(k-1, symbal);
				s = o.toString();
			}				
			return s;
		}).collect(Collectors.toList());
	}

	/*
	 * Определить, сколько раз повторяется в тексте каждое слово, которое
	 * встречается в нем.
	 */

	public void countWords(String text) {
		String[] words = text.toLowerCase().split("\\s+");
		HashMap<String, Integer> wordToCount = new HashMap<>();
		for (String word : words) {
			if (!wordToCount.containsKey(word)) {
				wordToCount.put(word, 0);
			}
			wordToCount.put(word, wordToCount.get(word) + 1);
		}
		for (String word : wordToCount.keySet()) {
			System.out.println(word + " " + wordToCount.get(word));
		}
	}

	/*
	 * Преобразовать текст так, чтобы только первые буквы каждого предложения были
	 * заглавными.
	 */

	public List<String> firstLetterToUpperCase(String text) {
		return Arrays.stream(text.toLowerCase().split("[.!?]\\s*"))
				.map((s) -> s.substring(0, 1).toUpperCase() + s.substring(1)).collect(Collectors.toList());
	}

	/*
	 * Все слова текста рассортировать по возрастанию количества заданной буквы в
	 * слове. Слова с одинаковым количеством расположить в алфавитном порядке.
	 */

	public List<String> sortBySpecificChar(String text, char symbal) {
		return Arrays.stream(text.split("\\s+")).sorted((o1, o2) -> Long
				.compare(o2.chars().filter(ch -> ch == symbal).count(), o1.chars().filter(ch -> ch == symbal).count()))
				.collect(Collectors.toList());
	}

	/*
	 * В заданном тексте найти подстроку максимальной длины, являющуюся палиндромом,
	 * т.е. читающуюся слева направо и справа налево одинаково
	 */

	public void findPalindrom(String text) {
		String breaker = "breaker";
		for (int i = 0; i < text.length(); i++) {
			for (int j = text.length() - 1; j > i; j--) {
				if (text.charAt(i) == text.charAt(j)) {
					StringBuilder s1 = new StringBuilder(text.substring(i, j + 1));
					StringBuilder s2 = new StringBuilder(text.substring(i, j + 1));
					s2.reverse();
					if (s1.toString().equals(s2.toString())) {
						breaker = s1.toString();
						System.out.println("Palindrom: " + s1);
						break;
					}
				}
			}
			if (!breaker.equals("breaker")) {
				break;
			}
		}
	}
}
