package com.app;

import java.util.Comparator;
import java.util.TreeSet;

public class StringSortByDictonary {
	public static String sortString(String s) {
		StringBuilder sb=new StringBuilder();
		String[] sArray=s.split(" ");
		StringSortByDictonary.cmp c= new StringSortByDictonary.cmp();
		TreeSet<String> t=new TreeSet(c);
		for(String s1:sArray)
		t.add(s1);
		for(String s2: t)
			
			sb.append(s2+" ");
		return sb.toString();
		
	}
	private static class cmp implements Comparator<String>{
		public int compare(String s1,String s2) {
			if(s1.length()>s2.length()) {
				return 1;
			}
			if(s1.length()==s2.length()) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Apple in a day keeps doctor away";
		String s1="I love tea";
		System.out.println(StringSortByDictonary.sortString(s));
		System.out.println(StringSortByDictonary.sortString(s1));

	}

}
