package com.practise.hackerrank.algorithms.Impl;

import java.util.Scanner;

public class Cloud {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        for(int j=0;j<(n-2);j++){
        	
        /*	if(j<(n-2)){*/
        		
        		//System.out.println("j values " +j);
        		
        		if((c[j+1]==0 || c[j+2]==0)){
            		
            		
            		count++;
            	}
        		
  /*      	}*/
        	   
        	
        }
        
       System.out.println(count-1);
        
    }

}
