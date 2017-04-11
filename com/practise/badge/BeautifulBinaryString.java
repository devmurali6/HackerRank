package com.practise.badge;

import java.util.Scanner;

public class BeautifulBinaryString {

	
	static int count=0;
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String B = in.next();
	        findMinCost(B,n);
	    }
	 
	    
	   private static void findMinCost(String b, int n) {
		// TODO Auto-generated method stub
	          int j=0;
		     while(j<=n-3){
		    	 
		    	 String str=b.substring(j, j+3);
		    	 
		    	 if(str.contains("010")){
		    		 count++;
		    		 j=j+2;
		    	 }
		    	 j++;
		    	 
		    	 System.out.println(str);
		    	 
		     }   
		     System.out.println(count);
	    }
}
