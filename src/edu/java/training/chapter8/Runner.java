package edu.java.training.chapter8;

public class Runner {

	public static void main(String[] args) {

		Formatter format = new Formatter();
		RegexFormatter regexFormatter = new RegexFormatter();
		String password = "paSSword8_";
		String palindromText = "qwertyuioiuqwer";
		String text = "Yesterday I visited my Granny in the countryside."
				+ " We go there every weekend and I enjoy these trips. But not this time."
				+ " It was raining cats and dogs, our car Granny broke several times and we all were very tired."
				+ " But when we saw the Granny, I forgot about the difficulties.";

		System.out.println(format.firstLetterToUpperCase(text));
		System.out.println(format.sortBySpecificChar(text, 'f'));
		System.out.println(format.replaceChar(text, '#', 3));
		format.findPalindrom(palindromText);
		System.out.print(regexFormatter.isPasswordSafe(password));
		format.countWords(text);
		System.out.println(regexFormatter.compressText(text));
		System.out.println(regexFormatter.alignText(text));
	}

}
