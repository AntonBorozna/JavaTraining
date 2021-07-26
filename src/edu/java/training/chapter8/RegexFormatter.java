package edu.java.training.chapter8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFormatter {

	/*
	 * Проверить, является ли строка сильным паролем. Пароль считается сильным, если
	 * его длина больше либо равна 10 символам, он содержит как минимум одну цифру,
	 * одну букву в верхнем и одну букву в нижнем регистре. Пароль может содержать
	 * только латинские буквы и/или цифры, а также символ «_».
	 */

	public boolean isPasswordSafe(String password) {
		Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?!.*[!@#$&*()]).{10}$");
		Matcher matcher = pattern.matcher(password);
		return matcher.find();
	}

	/*
	 * Осуществить сжатие английского текста, заменив каждую группу из двух или
	 * более рядом стоящих символов на один символ, за которым следует количество
	 * его вхождений в группу. К примеру, строка hellowoooorld должна сжиматься в
	 * hel2owo4rld.
	 */

	public String compressText(String text) {
		String compressedText = "";
		Pattern pattern = Pattern.compile("(.)\\1{0,}");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			compressedText += matcher.group(1);
			int length = matcher.group().length();
			if (length > 1) {
				compressedText += length;
			}
		}
		return compressedText;
	}

	/*
	 * Осуществить форматирование заданного текста с выравниванием по левому краю.
	 * Программа должна разбивать текст на строки с длиной, не превосходящей
	 * заданного количества символов. Если очередное слово не помещается в текущей
	 * строке, его необходимо переносить на следующую.
	 */

	public String alignText(String text) {
		String formattedText = text.replaceAll("\\s*([\\w&[^\n]]{0,49}(\\p{L}\\b|\\p{Punct}))", "$1\n");
		return formattedText;
	}
}
