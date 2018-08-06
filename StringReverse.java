package com.app;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a string to reverse:");
		String s1=s.nextLine();
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		System.out.println(sb);

	}

}
