package edu.java.training.chapter10.part_a;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class TextWriter {

	public void writeUsingFileWriter(String text) {
		try (Writer writer = new FileWriter("resources/test.txt")) {
			writer.write(text);
			File f = new File("resources/test.txt");			
			System.out.println(f.getAbsolutePath());
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
