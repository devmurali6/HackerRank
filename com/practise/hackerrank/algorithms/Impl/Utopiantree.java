package com.practise.hackerrank.algorithms.Impl;

import java.util.Scanner;

public class Utopiantree {

	/**
	 * @param args
	 */
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();

	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int initial_ht=1;
	              if(n==0){
	            	  System.out.println(initial_ht);
	              }else{
	            	  
	            	  if(n%2==0){
	            		     do {
	            		    	 int temp=initial_ht*2;
	            		    	 initial_ht=temp+1;
	            		    	 n=n-2;
	            		     }	while(n>=1) ;  
	            		     System.out.println(initial_ht);
	            	  }
	            	  else{
	            		  
	            		  do{
	            			  n=n-2;
	            			  int temp=initial_ht*2;
	            			   if(n>=1){
	            				   temp=temp+1;
	            			   }
	            				   initial_ht=temp;

	            		  }while(n>=0);

	            		  System.out.println(initial_ht);

	            	  }

	              }
	        }
	        
	        
	  }  
	  
}
