package com.practise.hackerrank.algorithms;


	
	
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class CircularArrayShift {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        
	        int q = in.nextInt();
	        int[] a = new int[n];
	        int[]result= new int[q];
	        
	        for(int a_i=0; a_i < n; a_i++){
	        	
	        	int index=((n+k+a_i)%n);
	        	a[index] = in.nextInt();
	        }
	    
	        for(int a0 = 0; a0 <q; a0++){
	            int m = in.nextInt();
	            result[a0]=m;
	            
	            //System.out.println(result.length);
	           
	        }
	        
	        for(int j=0;j<q;j++){
	        	
	        	int x=result[j];
	        	System.out.println(a[x]);
	        	
	        }
	    }
	}

	
	
	
	


