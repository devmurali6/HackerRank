package com.practise.badge;

import java.util.Scanner;

public class ViralAdvertising {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
	        int number_ppl=5;
	        int result=0;
	        int like=0;
	        for (int i = 0; i < n; i++) {
	        	
	        	 like=(int) Math.floor(number_ppl/2);
	        	
	        	  number_ppl=like*3;
	        	
	              result=result+like; 

			}
	        
	        System.out.println(result);
	        
	        
	        
	}

}
