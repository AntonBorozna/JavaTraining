package edu.java.training.chapter7.occurrence;

public class Counter {

	public int returnCount(String word, String text) {
		int count = text.split(word).length - 1;
		return count;
	}
}
