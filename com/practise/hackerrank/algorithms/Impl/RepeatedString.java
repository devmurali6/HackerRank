package com.practise.hackerrank.algorithms.Impl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedString {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		final String REGEX = "a";
		int count=0;
		long n = in.nextLong();
		
		int num=(int)n;
		
		String result = "";

		while (true) {
			result = result + s;
			if (result.length() >= n)
				break;

		}
	   String temp=result.substring(0,num);
	  	                 
	      Pattern p = Pattern.compile(REGEX);
	      Matcher m = p.matcher(temp);     
	      while(m.find()) {
	    	  count++;
	       }
		System.out.println(count);

	}

}
