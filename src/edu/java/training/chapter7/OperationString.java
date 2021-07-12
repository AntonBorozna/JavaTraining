package edu.java.training.chapter7;

/*
Написать функциональный интерфейс с методом, который принимает две
строки и возвращает тоже строку. Написать реализацию такого интерфейса
в виде лямбды, которая возвращает ту строку, которая длиннее.
 */

public interface OperationString {
	
	String getResult(String value1, String value2);
	
}