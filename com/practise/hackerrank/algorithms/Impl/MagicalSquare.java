package com.practise.hackerrank.algorithms.Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MagicalSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		  final int POSS[][][] = 
		        {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
		        {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
		        {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
		        {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
		        {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
		        {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
		        {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
		        {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}};
		    
	        int c[][] = new int[3][3];
	        
	        
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++)
	                c[i][j]=in.nextInt();
	        }
	   
	        int mincost=81;
	        
	        for(int i=0; i < 8; i++){
	        	
	        	int cost=0;
	        
	        	for (int j = 0; j <3; j++) {
	        		
	        		 for (int k = 0; k < 3; k++) {
	        			 
	        		  cost+=Math.abs(c[j][k] -POSS[i][j][k]);
						
					}

	        	}
	        	
	        	if(cost<mincost){
	        		mincost=cost;
	        	}
	        	
	        	
	        }
	        
	        System.out.println(mincost);
  
	}

}
