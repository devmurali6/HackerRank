package com.practise.hackerrank.algorithms;

import java.util.Scanner;

public class StairCase {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        
        for(int j=1; j <=n; j++){
        	
        	
        	for(int i=0;i<(n-j);i++){
	 
                System.out.print(" "); 
           
                
        	}
        	for(int k=1;k<=j;k++){
        		
        		System.out.print("#"); 
        		
        	}
        	
        	System.out.print("\n");
        	
            		
            
        }
        
        
    }

}
