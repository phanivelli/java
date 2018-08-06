package com.app;
public class stringDouble {
	  public static void main(String[] args) {
	    char[] t = "hhllyyjhhh".toCharArray();
	    String ans = "";
	    for (int i = 0; i < t.length; i++) {
	      int count = 1;
	      while (i + count < t.length && t[i + count] == t[i]) {
	        count++;
	      }
	      ans += t[i] + String.valueOf(count);
	      i += count - 1;
	    }
	    System.out.println(ans);
	 }
	    
	}
