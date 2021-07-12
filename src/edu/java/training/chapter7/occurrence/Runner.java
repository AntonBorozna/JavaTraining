package edu.java.training.chapter7.occurrence;

/*
Вывести количество вхождений заданного слова в тексте соответственно
из файла в виде [слово1-2, слово2-3, слово3-0].
 */

public class Runner {

	public static void main(String[] args) {
		Counter count = new Counter();
		Reader reader = new Reader();
		String file = "resources/text.txt";
		String word = "Granny";
		System.out.println(word + " " + count.returnCount(word, reader.readUsingBufferedReader(file)));

	}
}
