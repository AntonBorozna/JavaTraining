package edu.java.training.chapter10.part_a;

/*
 * В следующих заданиях требуется ввести последовательность строк из текстового потока и выполнить указанные действия. 
 * При этом могут рассматриваться два варианта:
 * • каждая строка состоит из одного слова;
 * • каждая строка состоит из нескольких слов.
 * Имена входного и выходного файлов, а также абсолютный путь к ним могут
 * быть введены как параметры командной строки или храниться в файле.
*/

public class Runner {

	public static void main(String[] args) {
		Reader reader = new Reader();
		TextFormatter formatter = new TextFormatter();
		TextWriter tw = new TextWriter();
		String text = reader.readUsingBufferedReader("resources/text.txt");
		tw.writeUsingFileWriter(formatter.deleteScecificString(text, "Granny"));
		tw.writeUsingFileWriter(formatter.getWordsStartsWithVowelLetters(text));
		tw.writeUsingFileWriter(formatter.getWordsWithTheSameLetters(text));
	}
}
