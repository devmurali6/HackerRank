package com.practise.badge;

import java.util.Scanner;

public class CountingValleys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String s = in.next();
	        int j=0;
	        int countValley=0;
	        int stepUp=0,stepDown=0;
	        while(j<n){
		    	 
	        	if(s.charAt(j)=='U'){
	        		stepUp++;	
	        	}
	        	else{
	        		
	        		if(stepUp==0){
	        			countValley++;
	        			stepUp--;
	        		}
	        		else{
	        			stepUp--;
	        		}
	            		
	        	}
	  
		    
		    	 j++;	    	 
		     }    
	        System.out.println(countValley);

	
	}
}
