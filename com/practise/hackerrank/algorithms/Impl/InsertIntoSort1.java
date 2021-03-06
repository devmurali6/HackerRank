package com.practise.hackerrank.algorithms.Impl;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertIntoSort1 {
    
    

    public static void insertIntoSorted(int[] ar) {
    	
    	
    	int current=ar[ar.length-1];
    	int j=ar.length-1;
    	
    	while(j>0 && ar[j-1]>current){
    		
    		ar[j]=ar[j-1];
    	
    		j--;
    		
    		printArray(ar);
    		
    	}
    	
       ar[j]=current;
       
       printArray(ar);
         
    	
    		 	
    
    	
        // Fill up this function  
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
