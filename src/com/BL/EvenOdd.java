package com.BL;

import java.util.Scanner;

public class EvenOdd {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getEvenOdd(int number) {

		if (number % 2 == 0) {
			System.out.println("Entered Number is Even");
		} else {
			System.out.println("Entered Number is odd");
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the number to check even or odd: ");
		int number = EvenOdd.getIntValue();
		EvenOdd.getEvenOdd(number);
	}

}
