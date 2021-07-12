package edu.java.training.chapter7;

/*
С помощью лямбда-выражений определить, можно ли из длин сторон a, b,
c образовать треугольник?
 */

public interface TriangleChecker {
	public boolean isTriangle(int a, int b, int c);

}
