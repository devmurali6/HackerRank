package com.practise.hackerrank.algorithms.Impl;

import java.util.Scanner;

public class BonAppetit {
	
	
	public static void main(String[] args) {
       
		 Scanner in = new Scanner(System.in);
	        
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int c[] = new int[n];
	        for(int c_i=0; c_i < n; c_i++){
	            c[c_i] = in.nextInt();
	        }
	        int charged=in.nextInt();
	        int sum=0;
	       
	        
	        for ( int j = 0;  j < c.length; j++) {
				
				if(j!=k){
					
					sum=sum+c[j];
				}
			}
	        int expenses=(sum/2);
	        
	        if(expenses==charged){
	        	System.out.println("Bon Appetit");
	        	
	        }
	        else{
	        	int extracharge=Math.abs(expenses-charged);
	        	System.out.println(extracharge);
	        }
		
		
    }

}
