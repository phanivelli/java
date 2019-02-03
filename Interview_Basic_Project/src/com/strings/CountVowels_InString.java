package com.strings;

import java.util.Scanner;

public class CountVowels_InString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String =");
		String str = sc.nextLine();
		System.out.println("Number of vowels in string : "+countVowels(str));
	}

	private static int countVowels(String str) {
		int count = 0;
		int len = str.length();
		str = str.toLowerCase();
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
				count++;
			
		}
		return count;
	}
}
