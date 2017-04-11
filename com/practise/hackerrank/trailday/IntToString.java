package com.practise.hackerrank.trailday;

import java.util.Scanner;

public class IntToString {

	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	       
	        try{
	         int result = Integer.parseInt(S);
	         System.out.println(result);
	        }
	        catch(Exception e){
	        	System.out.println("bad String");
	        }
	    }

}
