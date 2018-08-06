package com.app;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str,rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		str=s.nextLine();
		int ln=str.length();
		for(int i=ln-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("ur string is a palindrome string");
		}
		else {
			System.out.println("ur string is not a palindrome");
		}
		

	}

}
