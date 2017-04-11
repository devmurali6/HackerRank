package com.practise.hackerrank.trailday;

import java.util.Arrays;
import java.util.Scanner;

public class D2Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int arr_i=0; arr_i < 6; arr_i++){
	            for(int arr_j=0; arr_j < 6; arr_j++){
	                arr[arr_i][arr_j] = in.nextInt();
	            }
	        }
	        int count=0;
	        int[] temp=new int[16];
	        for(int i=0;i<4;i++){
	        	for(int j=0;j<4;j++){
	        		
	         temp[count]=arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + 
	        		     arr[i + 1][j + 1] + arr[i + 2][j] + 
	        		     arr[i + 2][j + 1] + arr[i + 2][j + 2];
	         
	           count++;
	          		
	        		
	        	}
	        } 
	        
	        
	        Arrays.sort(temp);
	        System.out.print(temp[temp.length-1]);
	    }
}
