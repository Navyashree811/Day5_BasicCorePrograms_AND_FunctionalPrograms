package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class SumOfThreeInteger {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getSumOfThreeInteger() {
		System.out.println("Enter number");
		int n = SumOfThreeInteger.getIntValue();

		int a[] = new int[n];
		System.out.println("Enter sum of three number");
		for (int i = 0; i < n; i++) {
			a[i] = SumOfThreeInteger.getIntValue();

		}
		for (int i = 0; i < a.length - 1; i++) {

			for (int j = i + 1; j < a.length - 1; j++) {

				for (int k = j + 1; k < a.length; k++) {

					if (a[i] + a[j] + a[k] == 0) {

						System.out.println("Sum of these --->" + a[i] + a[j] + a[k]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		SumOfThreeInteger.getSumOfThreeInteger();

	}

}
