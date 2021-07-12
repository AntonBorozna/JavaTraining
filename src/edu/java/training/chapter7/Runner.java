package edu.java.training.chapter7;

public class Runner {

	public static void main(String[] args) {

		Replacer replacer = new Replacer();
		replacer.replace();

		Transformator transformator = new Transformator();
		transformator.transformate("This is a sample sentence.", 2, 14);
		
		Anagram anagram = new Anagram();
		System.out.print(anagram.isAnagram("sink", "skin"));

		OperationBoolean operationBoolean = (value) -> value % 13 == 0;
		System.out.println(operationBoolean.getResult(26));
		System.out.println(operationBoolean.getResult(20));

		OperationString operationString = (value1, value2) -> (value1.length() > value2.length()) ? value1 : value2;
		System.out.println(operationString.getResult("123", "1"));
		System.out.println(operationString.getResult("1", "321321"));

		OperationDiscremenant descremenant = (a, b, c) -> ((b * b) - 4 * a * c);
		System.out.println(descremenant.getResult(2, 3, 4));

		FibonacciChecker fibChecker = (num) -> (5 * num * num - 4) == ((long) Math.sqrt(5 * num * num - 4)
				* (long) Math.sqrt(5 * num * num - 4))
				|| (5 * num * num + 4) == ((long) Math.sqrt(5 * num * num + 4) * (long) Math.sqrt(5 * num * num + 4));
		System.out.println("Is fibonacci number: " + fibChecker.isFibonacci(8));

		TriangleChecker triangleChecker = (a, b, c) -> (a + b > c) || (a + c > b) || (b + c > a);
		System.out.println("Is triangle: " + triangleChecker.isTriangle(8, 7, 6));
	}
}
