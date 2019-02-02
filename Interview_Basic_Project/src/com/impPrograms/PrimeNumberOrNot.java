package com.impPrograms;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int i = 2;
		boolean flag = false;
		while( i <= num/2) {
			if(num % 2 == 0) {
				flag = true;
				break;
			}
			++i;
		}
		if (!flag) {
			System.out.println(num+" is a prime number");
		}
	}

}
