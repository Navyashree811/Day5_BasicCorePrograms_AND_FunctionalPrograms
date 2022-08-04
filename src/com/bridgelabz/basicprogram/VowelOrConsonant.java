package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class VowelOrConsonant {
	static Scanner sc = new Scanner(System.in);

	public static String getString() {
		return sc.nextLine();
	}

	public static void getVowelOrConsonant(String s) {

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println("  Vowel  : " + ch);
			} else {
				System.out.println(" Consonant  : " + ch);
			}

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		String s = VowelOrConsonant.getString();
		VowelOrConsonant.getVowelOrConsonant(s);
	}

}
