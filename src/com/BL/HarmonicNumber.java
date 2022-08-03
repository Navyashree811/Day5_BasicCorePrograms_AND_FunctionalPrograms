package com.BL;

import java.util.Scanner;

public class HarmonicNumber {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getHarmonicNumber(int number) {
		double harmonicNumber = 0;
		for (double i = 1; i <= number; i++) {
			harmonicNumber = harmonicNumber + (1 / i);
		}
		System.out.println("n'th Harmonic Number of " + number + "" + harmonicNumber);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number to check the harmonic number : ");
		int number = HarmonicNumber.getIntValue();
		HarmonicNumber.getHarmonicNumber(number);
	}

}
