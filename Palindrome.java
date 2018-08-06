package com.app;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number::");
		n=s.nextInt();
		
		temp=n;
		while(temp>0) {
			sum=(temp%10)+(sum*10);
			temp/=10;
		}
		if (n==sum)
			System.out.println("it is a palindrome number");
		else
			System.out.println("not an palindrome number");

	}

}
