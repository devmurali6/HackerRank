package com.practise.hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class VeryBig {
	
   static long sum;
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        for(int j=0; j < n; j++){
            		
            sum=sum+arr[j];		
        }
        
        System.out.println(sum);
        
    }

}


