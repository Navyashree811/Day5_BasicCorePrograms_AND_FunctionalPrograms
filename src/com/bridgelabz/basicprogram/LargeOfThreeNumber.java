package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class LargeOfThreeNumber {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getLargeOfThreeNumber(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {
			System.out.println("First number is largest");
		} else if (num2 > num3 && num2 > num1) {
			System.out.println("Second number is largest");
		} else if (num3 > num2 && num3 > num1) {
			System.out.println("Third number is largest");
		} else {
			System.out.println("None of the elements are greater");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the first number: ");
		int num1 = LargeOfThreeNumber.getIntValue();
		System.out.println("Enter the second number: ");
		int num2 = LargeOfThreeNumber.getIntValue();
		System.out.println("Enter the third number: ");
		int num3 = LargeOfThreeNumber.getIntValue();
		LargeOfThreeNumber.getLargeOfThreeNumber(num1, num2, num3);
	}

}
