package edu.java.training.chapter9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import edu.java.training.chapter9.customexception.EmptyFileException;
import edu.java.training.chapter9.customexception.NotInRangeException;

public class FileOperator {

	public List<String> splitString(String text) throws EmptyFileException {
		if (!text.isEmpty()) {
			return Arrays.stream(text.split("\\s+")).collect(Collectors.toList());
		} else {
			throw new EmptyFileException();
		}
	}

	public boolean isNumberic(List<String> text) {
		boolean areThereAnyErrors = true;
		for (String element : text) {
			try {
				Double.parseDouble(element);
			} catch (NumberFormatException e) {
				System.out.println(e);
				areThereAnyErrors = false;
			}
		}
		return areThereAnyErrors;
	}

	public double getSum(List<String> text) throws NotInRangeException {
		double sum = 0;
		for (String element : text) {
			try {
				Double.parseDouble(element);
				sum += Double.parseDouble(element);
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
			if (Double.parseDouble(element) < -1000 || Double.parseDouble(element) > 1000) {
				throw new NotInRangeException();
			}
		}
		return sum;
	}

	public double getAverage(List<String> text) throws NotInRangeException {
		double sum = 0;
		for (String element : text) {
			try {
				Double.parseDouble(element);
				sum += Double.parseDouble(element);
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
			if (Double.parseDouble(element) < -1000 || Double.parseDouble(element) > 10000000) {
				throw new NotInRangeException();
			}
		}
		return sum / text.size();
	}
}