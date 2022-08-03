package com.BL;

import java.util.Scanner;

public class PrimeFactor {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	// A function to print all prime factors of a given number
	public static void getPrimeFactors(int number) {
		for (int i = 2; i < number; i++) {
			while (number % i == 0) { // factor
				System.out.println(i + " ");
				number = number / i; // prime number
			}
		}
		// this condition is to handle the case when
		// n is a prime number greater than 2

		if (number > 2) {
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int number = PrimeFactor.getIntValue();
		PrimeFactor.getPrimeFactors(number);
	}

}
