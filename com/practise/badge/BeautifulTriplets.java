package com.practise.badge;

import java.util.Scanner;

public class BeautifulTriplets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d= in.nextInt();
        int count=0;
        int[] wrote=new int[n];
        for(int i=0; i < n; i++){
            wrote[i] = in.nextInt();
        }
        
        for (int i = 0; i < wrote.length; i++) {
        	
        	for(int j=i+1;j<wrote.length-1;j++){
        		
        	   
        		  if(i<j &&  (wrote[j]-wrote[i])==d ){
        			  
        			  System.out.println(wrote[j] + '-' + wrote[i]);
        			  
        		  }
        		
        		
        	}
        	
		}
		
        
        
	}

}
