package edu.java.training.chapter10.part_a;

import java.util.ArrayList;
import java.util.List;

public class TextFormatter {

	/*
	 * В каждой строке найти и удалить заданную подстроку
	 */

	public String deleteScecificString(String text, String stringToBeDeleted) {
		String formattedText = null;
		if (text.contains(stringToBeDeleted)) {
			formattedText = text.replaceAll(stringToBeDeleted, "");
		} else {
			formattedText = text;
		}
		return formattedText;
	}

	/*
	 * В каждой строке найти слова, начинающиеся с гласной буквы.
	 */

	public String getWordsStartsWithVowelLetters(String text) {
		String[] words;
		words = text.split("\\s+");
		List<String> wordsStartsWithVowelLetters = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].charAt(0) == 'A' || words[i].charAt(0) == 'a' || words[i].charAt(0) == 'E'
					|| words[i].charAt(0) == 'e' || words[i].charAt(0) == 'I' || words[i].charAt(0) == 'i'
					|| words[i].charAt(0) == 'O' || words[i].charAt(0) == 'o' || words[i].charAt(0) == 'U'
					|| words[i].charAt(0) == 'u' || words[i].charAt(0) == 'Y' || words[i].charAt(0) == 'y') {
				wordsStartsWithVowelLetters.add(words[i]);
			}
		}
		return wordsStartsWithVowelLetters.toString();
	}

	/*
	 * Найти и вывести слова текста, для которых последняя буква одного слова
	 * совпадает с первой буквой следующего слова.
	 */

	public String getWordsWithTheSameLetters(String text) {
		String[] words;
		words = text.split("[^A-Za-z]+");
		List<String> wordsStartsWithVowelLetters = new ArrayList<>();
		for (int i = 1; i < words.length; i++) {
			if (words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)) {
				wordsStartsWithVowelLetters.add(words[i - 1]);
				wordsStartsWithVowelLetters.add(words[i]);
			}
		}
		return wordsStartsWithVowelLetters.toString();
	}
}
