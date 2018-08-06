package com.app;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int[] ar)
	{
		   for (int i=1; i <( ar.length); i++)
		   {
		      int index = ar[i];
		      int j = i;
		      while (j > 0 && ar[j-1] > index)
		      {
		           ar[j] = ar[j-1];
		           j--;
		      }
		      ar[j] = index;
		} 
		   printNumbers(ar);
	}
	private static void printNumbers(int in[]) {
		 System.out.println("inserted elements:");
			for(int  i=0;i<in.length;i++)
				System.out.println(in[i]);
	}
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a numbers to be insert sort:");
		int n=s.nextInt();
		int in[]=new int[n];
		System.out.println("Enter " + n + " integers");
		 for (int i= 0;i<n;i++) 
		      in[i] = s.nextInt(); 
		insertionSort(in);
		
		}


}
