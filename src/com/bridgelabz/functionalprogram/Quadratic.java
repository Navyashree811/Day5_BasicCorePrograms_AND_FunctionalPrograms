package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class Quadratic {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static double getQuadratic(int a, int b, int c) {
		System.out.println("Entering Quadratic program");
		double delta = (Math.pow(b, 2)) - 4 * a * c;
		System.out.println(delta);
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.println("Root 1 value : " + root1);
		System.out.println("Root 2 value : " + root2);
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Enter the first number: ");
		int a = Quadratic.getIntValue();
		System.out.println("Enter the second number: ");
		int b = Quadratic.getIntValue();
		System.out.println("Enter the third number: ");
		int c = Quadratic.getIntValue();
		Quadratic.getQuadratic(a, b, c);
	}

}
