package com.strings;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String =");
		String str = sc.nextLine();
		boolean rs = strPalindrome(str);
		if(rs) {
			System.out.println(str+ " is palindrome");
		}else {
			System.out.println(str+ "is not palindrome");
		}
	}

	private static boolean strPalindrome(String str) {
		String revStr = "";
		char[] ch = str.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			revStr += ch[i];
		}
		return str.equalsIgnoreCase(revStr);
	}
}
