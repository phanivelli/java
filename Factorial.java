package com.app;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if (n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1,i,num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		num=s.nextInt();
		fact=factorial(num);
		System.out.println("Factorial of" + num +"is:"+fact);
	}

}
