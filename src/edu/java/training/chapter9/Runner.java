package edu.java.training.chapter9;

import edu.java.training.chapter9.customexception.EmptyFileException;
import edu.java.training.chapter9.customexception.NotInRangeException;

/*
 * 	В символьном файле находится информация об N числах с плавающей запятой
 * с указанием локали каждого числа отдельно. Прочитать информацию из файла.
 * Проверить на корректность, то есть являются ли числа числами. Преобразовать
 * к числовым значениям и вычислить сумму и среднее значение прочитанных чисел.
 * 	Создать собственный класс исключения. Предусмотреть обработку исключений, 
 * возникающих при нехватке памяти, отсутствии самого файла по заданному адресу, 
 * отсутствии или некорректности требуемой записи в файле, недопустимом значении 
 * числа (выходящим за пределы максимально допустимых значений) и т.д.
 */

public class Runner {

	public static void main(String args[]) {
		Reader reader = new Reader();
		FileOperator operator = new FileOperator();
		String file = "resources/numbers1.txt";
		System.out.println(reader.readUsingBufferedReader(file));
		try {
			System.out.println(operator.splitString(reader.readUsingBufferedReader(file)));
		} catch (EmptyFileException e) {
			System.out.println(e);
		}
		try {
			System.out.println(operator.isNumberic(operator.splitString(reader.readUsingBufferedReader(file))));
		} catch (EmptyFileException e) {
			System.out.println(e);
		}
		try {
			System.out.println(operator.getSum(operator.splitString(reader.readUsingBufferedReader(file))));
		} catch (EmptyFileException | NotInRangeException e) {
			System.out.println(e);
		}
		try {
			System.out.println(operator.getAverage(operator.splitString(reader.readUsingBufferedReader(file))));
		} catch (EmptyFileException | NotInRangeException e) {
			System.out.println(e);
		}
	}
}
