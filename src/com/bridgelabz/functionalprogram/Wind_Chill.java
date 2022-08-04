package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class Wind_Chill {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static double getWindChill(double t, double v) {

		System.out.println(" Entering Wind Chill Program : ");
		double w = 35.75 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println(w);
		return w;
	}

	public static void main(String[] args) {
		System.out.println("Enter first argument : ");
		double t = Wind_Chill.getIntValue();

		System.out.println("Enter Second argument : ");
		double v = Wind_Chill.getIntValue();
		Wind_Chill.getWindChill(t, v);
	}

}
