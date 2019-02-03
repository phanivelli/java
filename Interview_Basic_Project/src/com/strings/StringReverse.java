package com.strings;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		strReverse(str);
		sc.close();
	}

	private static void strReverse(String str) {
		String strRev = "";
		char[] ch = str.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			strRev += ch[i];
		}
		System.out.println("string reverse "+strRev);
 		
	}
}
