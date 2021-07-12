package edu.java.training.chapter7;

/*
 Написать функциональный интерфейс с методом, который принимает три
дробных числа: a, b, c и возвращает тоже дробное число. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант. 
 */

public interface OperationDiscremenant {
	
	Double getResult(double a, double b, double c);

}
