package com.practise.hackerrank.algorithms.Impl;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
       			
		     BigInteger output=factorial(BigInteger.valueOf(n));		     
		     System.out.println(output);

    }

	private static BigInteger factorial(BigInteger n) {
			
	  
	   BigInteger temp=n.subtract(BigInteger.valueOf(1));
		
		if (n.equals(BigInteger.valueOf(1))) 
			
			return BigInteger.valueOf(1); 
			
			 return  n.multiply(factorial(temp)); 
	}

}
