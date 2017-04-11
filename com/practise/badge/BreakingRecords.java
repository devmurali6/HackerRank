package com.practise.badge;

import java.util.Scanner;

public class BreakingRecords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxCount=0;
        int minCount=0;

        int[] records=new int[n];
        for(int i=0; i < n; i++){
            records[i] = in.nextInt();
        }
        
        int initialScore=records[0];
        int initialminScore=records[0];
        
        for (int i = 0; i < records.length-1; i++) {
        	 
        	     if(initialScore<records[i+1]){
        	    	     initialScore=records[i+1];
        	    	     maxCount++;
     
        	     }
		}
        for (int i = 0; i < records.length-1; i++) {
       	 
   	     if(initialminScore>records[i+1]){
   	    	initialminScore=records[i+1];
   	    	     minCount++;

   	       }
	    }

        System.out.println(maxCount+" "+ minCount);

	}

}
