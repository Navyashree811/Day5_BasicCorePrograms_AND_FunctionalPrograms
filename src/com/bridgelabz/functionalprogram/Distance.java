package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class Distance {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static double getDistance(int x, int y) { // x=2, y=2

		System.out.println("Entering Distance program");
		// 2,2 //2,2
		double d = Math.pow(x, x) + Math.pow(y, y);
		System.out.println("print value of d: " + d); // x=4, y=4 ==> d=>8

		return Math.sqrt(d);

	}

	public static void main(String[] args) {
		System.out.println("Enter value of x");
		int x = Distance.getIntValue();

		System.out.println("Enter value of y");
		int y = Distance.getIntValue();

		Distance.getDistance(x, y);
	}

}
