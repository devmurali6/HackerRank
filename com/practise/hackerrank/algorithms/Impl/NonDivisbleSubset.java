package com.practise.hackerrank.algorithms.Impl;

import java.util.ArrayList;
import java.util.Scanner;

public class NonDivisbleSubset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        int count=0;
        
        ArrayList<Integer> result= new ArrayList<Integer>();
        
        
        for(int c_i=0; c_i < n; c_i++){
        	
        	int temp=in.nextInt();
        	result.add(temp);
            c[c_i] = temp;
        }
        
      
        
         findSubSet(result,k);
        
        
         
   
         System.out.println(result.size());

	  }

	private static void  findSubSet(ArrayList<Integer> result,int k) {
	
		for (int i = 0; i < result.size()-1; i++) {
        	
      	  for (int j = i; j <result.size()-1; j++) {
      		  
      		    if(    (result.get(i) + result.get(j+1))%k==0){
      		    	
      		    	   result.remove(j+1);
   
      		    }
      		   
				
			}

		}
		
		
	}

}
