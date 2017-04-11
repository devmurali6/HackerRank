package com.practise.hackerrank.trailday;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {
	
	
	public static String[] firstArray;
	static String[] secondArray;

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);    	
    	int space = sc.nextInt();
  	
    	for(int i=0;i<space;i++){
    		
    		String fs=sc.next();
    		
    		for(int j=0;j<fs.length();j++){
    			
    			if(j%2==0){
    				
    				 System.out.print(fs.charAt(j)); 	
    			}
    			
    		}
    		System.out.print(" ");
    		
    		
    		
			for(int k=0;k<fs.length();k++){
			    			
			    			if(k%2==1){
			    				
			    				 System.out.print(fs.charAt(k)); 	
			    			}
			    			
			    		}
    	}	

    }
   
    
}
