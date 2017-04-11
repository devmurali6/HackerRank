
/*
We say that a string, , contains the word hackerrank if a subsequence of the characters in  spell the word hackerrank. 
For example, haacckkerrannkk does contain hackerrank, but haacckkerannk does not (the characters all appear in the same order, 
		but it's missing a second r).
*/



package com.practise.badge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HackerString {

	/**
	 * @param args
	 */
	static List<Character> setString= new ArrayList();
	static String hackString="hackerrank";
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	              String s = in.next();
	              char[] inputChar=s.toCharArray();  
	              boolean result=findMatch(s);  
	              if(result)
	            	  System.out.println("YES");
	              else
	            	  System.out.println("NO");
 
	        }
	         
	    }

	private static boolean findMatch(String input) {
	
		 int j=0;
		 for(int i=0;i<input.length();i++){
	       	  if(input.charAt(i) == hackString.charAt(j)){
	       		     j++;
		         }  
	       	  if(j==hackString.length()){
	       		  return true;
	       	  }
	
	         }           
	    return  false;
	
		
	}

}
