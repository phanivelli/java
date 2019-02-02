package com.impPrograms;

import java.util.Scanner;

public class Number_PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (num>0) {
			System.out.println(num+ " is positive integer");
		}else if (num<0) {
			System.out.println(num+ " is negative number");
		} 
	}
}
