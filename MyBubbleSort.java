package com.app;

import java.util.Scanner;

public class MyBubbleSort {
	
	public static void bubbleSort(int ar[]) {
		for(int i=(ar.length-1);i>=0;i--)
		{
			for(int j=1;j<=1;j++) 
			{
				if(ar[j-1]>ar[j])
				{
					int temp=ar[j-1];
					ar[j-1]=ar[i];
					ar[i]=temp;
				}
			}	
		}
		printNumbers(ar);
	}
	private static void printNumbers(int in[]) {
		 System.out.println("Sorted elements:");
			for(int  i=0;i<in.length;i++)
				System.out.println(in[i]);
	}
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a numbers to made bubble sort:");
		int n=s.nextInt();
		int in[]=new int[n];
		System.out.println("Enter " + n + " integers");
		 for (int i= 0; i < n; i++) 
		      in[i] = s.nextInt(); 
		bubbleSort(in);
		
		}

	}


