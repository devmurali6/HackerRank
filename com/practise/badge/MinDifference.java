
/*Consider an array of integers, . We define the absolute difference between two elements, and  (where ), to be the absolute value of .

Given an array of  integers, find and print the minimum absolute difference between any two elements in the array.
*/

package com.practise.badge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinDifference {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        
	        ArrayList<Integer> result= new ArrayList();
	        int minval=0;
	        
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        
	           Arrays.sort(a);
	           for(int i=0; i < n-1; i++){
	        	        		
	        			 int temp=Math.abs(a[i]-a[i+1]);
	        			 result.add(temp);
	        		 
	            }
	        
                  Collections.sort(result);
	        	  minval= result.get(0);
	        	  System.out.println(minval);

	        }
	        
}     


