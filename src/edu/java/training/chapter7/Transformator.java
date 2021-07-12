package edu.java.training.chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
С помощью лямбда-выражений создать метод, который на вход принимает
строку, количество копий N, ограничение на общую длину L. Поставить
запятые после каждого слова, сделать N копий, и если слов больше M — не
выводить остальные слова.
 */
public class Transformator {

	void transformate(String text, int numberOfCopies, int limitation) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(text.split(" ")));
		System.out.println("Devided list: " + list + " " + list.size());
		list.stream().map((s) -> s + ",").collect(Collectors.toList());
		ArrayList<String> sourceList = new ArrayList<String>(list);
		for (int i = 0; i < numberOfCopies; i++) {
			list.addAll(sourceList);
		}
		System.out.println("Copied list " + numberOfCopies + " times: " + list + " " + list.size());
		System.out.println(
				"Limit " + limitation + " words: " + list.stream().limit(limitation).collect(Collectors.toList()));
	}
}
