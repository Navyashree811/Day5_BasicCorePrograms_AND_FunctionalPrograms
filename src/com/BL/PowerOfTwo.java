package com.BL;

import java.util.Scanner;

public class PowerOfTwo {

	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	// function find the power of a number
	public static void power(int n) { // n=2
		int j = (int) Math.pow(2, n); // 2 pow 2 => j=> 4
		// 2
		System.out.println(2 + " to the power " + n + " is:" + j);

		int k = 2;
		System.out.println("Entering PowerOfTwo Program");

		if (n >= 0 && n < 31) { // n=2
			while (k > j) { // k=2, j=4, 2<4 ,,,,, 4>4
				k = k * 2;
			}
			System.out.println("Given value is Power of range is 0-30 ");
		} else {
			System.out.println("Invalid Range Please Enter Power of Range is 0-30 ");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter your number"); // User input:-- 2
		int n = PowerOfTwo.getIntValue();

		PowerOfTwo.power(n);

	}
}
