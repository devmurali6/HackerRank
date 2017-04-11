package com.practise.badge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumDistances {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int A[] = new int[n];
	        int min=-1;
	        ArrayList<Integer> result= new ArrayList();
	        for(int A_i=0; A_i < n; A_i++){
	            A[A_i] = in.nextInt();
	        }
	      
	        for(int i=0; i < n; i++){
	             
	        	 for(int j=i+1;j<n;j++){
	        		 
	        		 if(A[i]==A[j]){
	       
	        			 int temp=Math.abs(i-j);
	        			 result.add(temp);
	        		 }
	            }
	        }
	        
	        Collections.sort(result);
	        
	        if(result.isEmpty()){
	        	System.out.println(min);
	        }
	        else{
	        	  min= result.get(0);
	        	  System.out.println(min);
	        }

	    }
}
