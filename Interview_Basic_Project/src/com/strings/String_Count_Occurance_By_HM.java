package com.strings;

import java.util.HashMap;
import java.util.Scanner;

public class String_Count_Occurance_By_HM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		sc.close();
		countCharachters_HashMap(str);
	}

	private static void countCharachters_HashMap(String str) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}else {
				charCountMap.put(c, 1);
			}
		}
		System.out.println(charCountMap);
	}

}
