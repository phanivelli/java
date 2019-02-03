package com.strings;

import java.util.Scanner;

public class CheckStringAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings:");
		String fst = sc.nextLine();
		String scnd = sc.nextLine();
		if (checkAnagram(lowerCase(fst),lowerCase(scnd))) {
			System.out.println("Strings are Anagram");
		}else {
			System.out.println("Strings are not anagram");
		}
	}

	private static boolean checkAnagram(String fst, String scnd) {
		String s1 = removeSpace(fst);
		String s2 = removeSpace(scnd);
		if (s1.length() != s2.length()) {
			return false;
		}
		s1 = sort(fst);
		s2 = sort(scnd);
		for (int i = 0; i < s1.length(); i++) {
			if(s1.length() != s2.length()) {
				return false;
			}
		}
		return true;
	}

	private static String sort(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]>ch[j]) {
					char tmp = ch[i];
					ch[i] = ch[j];
					ch[j] = tmp;
				}
			}
		}
		return new String(ch);
	}

	private static String removeSpace(String st) {
		String str="";
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) != ' ') {
				str += st.charAt(i);
			}
		}
		return str;
	}

	private static String lowerCase(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i] -= 32;
			}
		}
		return new String(ch);
	}

}
