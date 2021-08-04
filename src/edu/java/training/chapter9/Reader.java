package edu.java.training.chapter9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public String readUsingBufferedReader(String fileName) {
		StringBuilder stringBuilder = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line = null;
			String ls = System.getProperty("line.separator");
			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(ls);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		return stringBuilder.toString();
	}
}
