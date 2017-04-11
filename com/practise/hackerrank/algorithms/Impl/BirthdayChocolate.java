package com.practise.hackerrank.algorithms.Impl;

import java.util.Scanner;

public class BirthdayChocolate {

	static int getWays(int[] squares, int d, int m){
		int result=0;

		if(squares.length>1) {
			
			for (int i = 0; i <= squares.length-m; i++) {
				
				int sum=0;
			  for (int j = i; j < i+m; j++) {
				  sum=sum+squares[j];
			
			   }
				   
			System.out.println(sum);		
				    	
				  
				if(sum==d){
					result++;
				}
				
				
			}
			
			
		}
		
		else{
			
			if(squares[0]==d){
				result++;
			}
			
		}
		
		return result;
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }

}
