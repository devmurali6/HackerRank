package com.practise.hackerrank.algorithms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
	
	
	 public static double poscount;
	 public static double negcount;
	 public static double zerocount;
	 private static DecimalFormat df2 = new DecimalFormat("0.00000");
	 
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        
	        for(int j=0; j < n; j++){
        		
	           if(arr[j]>0){
	        	   poscount++;
	           }
	           
	           else if(arr[j]<0){
	        	   negcount++;
	           }
	           
	           else {
	        	   zerocount++;
	           }
	        }
	        
	         
	        System.out.println((float)( poscount/n ));
	        System.out.println(df2.format(negcount/n));
	        System.out.println(df2.format(zerocount/n));
	        
	        
	    }
	
	

}
