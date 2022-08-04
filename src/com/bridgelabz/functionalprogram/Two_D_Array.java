package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class Two_D_Array {
	static Scanner sc = new Scanner(System.in);

	public static int getInt() {
		return sc.nextInt();
	}

	// To make Two-D array
	public static int[][] getArrays() {
		System.out.println("Enter row");
		int n = Two_D_Array.getInt(); // take size of array to user

		System.out.println("Enter column");
		int m = Two_D_Array.getInt();
		int[][] ar = new int[n][m]; // Two-D array

		System.out.println("Enter " + n * m + " elements of array");
		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar.length; j++) {
				ar[i][j] = Two_D_Array.getInt();
			}
		}
		return ar;
	}

	public static void dispArrays(int[][] ar) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.println("ar" + "[" + i + "]" + "[" + j + "]" + "= " + ar[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		int[][] ar = Two_D_Array.getArrays();
		System.out.println("Display array");

		Two_D_Array.dispArrays(ar);
	}

}
