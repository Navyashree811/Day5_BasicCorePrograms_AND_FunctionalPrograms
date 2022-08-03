package com.BL;

import java.util.Scanner;

public class SwapTwoNumber {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getSwappingTwoNumber(int number1, int number2) {
		int temp;

		// swapping in steps
		temp = number1;
		number1 = number2;
		number2 = temp;

		// verify swapped values
		System.out.println("number1 = " + number1 + " and number2 = " + number2);
	}

	public static void main(String[] args) {
		System.out.println("Enter the First Number: ");
		int number1 = SwapTwoNumber.getIntValue();
		System.out.println("Enter the Second Number: ");
		int number2 = SwapTwoNumber.getIntValue();
		SwapTwoNumber.getSwappingTwoNumber(number1, number2);

	}

}
