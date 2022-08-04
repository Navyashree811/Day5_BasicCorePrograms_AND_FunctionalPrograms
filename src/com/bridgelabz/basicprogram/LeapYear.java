package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class LeapYear {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) { // if year is evenly divisible by 4 , 100 or
																			// 400 then
			System.out.println("Specified year is a leap year"); // we should getting leap year otherwise it is not a
																	// leap year.
		} else {
			System.out.println("Specified year is not a leap year");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter an Year : ");
		int year = LeapYear.getIntValue();
		LeapYear.getLeapYear(year);

	}

}
