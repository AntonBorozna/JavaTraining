package edu.java.training.chapter7;

import java.util.Arrays;

/*
Определить, являются ли слова анаграммами, т.е. можно ли из одного слова
составить другое перестановкой букв
 */

public class Anagram {
			
	boolean isAnagram(String firstWord, String secondWord) {
		char[] word1 = firstWord.replaceAll("", "").toCharArray();
		char[] word2 = secondWord.replaceAll("", "").toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);		
		return Arrays.equals(word1, word2);
	}

}
