package com.strings;

import java.util.Scanner;

public class StringCountCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		countCharachters(str);
	}

	private static void countCharachters(String str) {
		String strCount="";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			while ( i + count < ch.length && ch[i+count] == ch[i]) {
				count++;
			}
			strCount += ch[i]+String.valueOf(count);
			i += count-1;
		}
		System.out.println(strCount);
	}

}
