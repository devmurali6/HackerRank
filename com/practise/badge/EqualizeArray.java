package com.practise.badge;

import java.util.Arrays;
import java.util.Scanner;


/*Equalize the Array*/

public class EqualizeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int index;
		 int sum = 0;
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[] = new int[101];
	        for(int a_i=1; a_i <= n; a_i++){
	            {
	            	index=in.nextInt();
	            	
	                a[index]++;
	            }
	        }
	        
	    	Arrays.sort(a);
	    
	        int max = a[a.length -1];
	        /*System.out.println("max---" +max);*/

	       /* System.out.println("sum" +sum);*/
	        System.out.println((n-max));

	}

}
