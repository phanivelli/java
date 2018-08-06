package com.app;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,temp,num,sum=0;
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=s.nextInt();
		temp=n;
		while(n>0) {
			num=n%10;
			n=n/10;
			sum=sum+(num*num*num);
		}
		if (temp==sum)
			System.out.println("u r number is a armstrong!");
		else
			System.out.println("ur number is not an armstrong number");
	}

}
