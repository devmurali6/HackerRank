package com.practise.badge;

import java.util.Scanner;

public class SumXor {

	/**
	 * @param args
	 */
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        long n = in.nextLong();
	        int count=1;
	      /*for (long i = 0; i <= n; i++) {
			
               	long add=i+n;
               	long xor=i^n;
               	
               	if(add==xor){
               		count++;
               	}

	      }  */
	        
	        while(n>1){
	        	if(n%2==0){
	        		count=count*2;
	        	}
	            
	            n=n/2; 
	       } 
	      System.out.println(count);
	  }
}


