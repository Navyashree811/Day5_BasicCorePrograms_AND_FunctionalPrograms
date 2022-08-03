package com.BL;

import java.util.Scanner;

public class FlipCoin {

	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getFlipCoin(int number) {
		double head = 0, percentHead = 0, tail = 0, percentTail = 0;
		for (int i = 0; i < number; i++) {
			double flip = (double) Math.random();
			if (flip < 0.5) {
				System.out.println("Result of flip coin is Tail");

				percentTail = flip * 100 / number;
				System.out.println("Percentage of tail is : " + percentTail);

			} else {
				System.out.println("Result of flip coin is Head");
				System.out.println("Percentage of head is : " + (100 - percentTail));
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		int number = FlipCoin.getIntValue();
		FlipCoin.getFlipCoin(number);
	}

}
