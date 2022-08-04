package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getComputeQuotientAndRemainder(int divisor, int divident) {

		int quotient = divident / divisor;
		int remainder = divident % divisor;

		System.out.println("Quotient value:" + quotient);
		System.out.println("Remaider value:" + remainder);
	}

	public static void main(String[] args) {
		System.out.println("Enter the value of the divisor: ");
		int divisor = ComputeQuotientAndRemainder.getIntValue();
		System.out.println("Enter the value of the divisor: ");
		int divident = ComputeQuotientAndRemainder.getIntValue();
		ComputeQuotientAndRemainder.getComputeQuotientAndRemainder(divisor, divident);
	}

}
