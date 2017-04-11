package com.practise.hackerrank.algorithms.Impl;

import java.util.Scanner;

public class SherlockSquares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	          
		   Scanner in = new Scanner(System.in);
	        int t = in.nextInt();

	        for (int i = 0; i < t; i++) {
	        		 int a=in.nextInt();
	        		 int b=in.nextInt();
	        		 System.out.println( (((int)Math.floor(Math.sqrt(b)))  - (int)(Math.ceil(Math.sqrt(a)))) +1 );

			}
	       
   
	}

	private static void findSqaures(int a, int b) {
		 
		
	/*	System.out.println((int)Math.ceil(Math.sqrt(a)));
		System.out.println((int)Math.floor(Math.sqrt(b)));*/
		
		
		
	
		
	}

}
