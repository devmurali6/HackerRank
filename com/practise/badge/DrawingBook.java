package com.practise.badge;

import java.util.Scanner;

public class DrawingBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
       
        // forward reading
         int i=1;
        while(i!=p && p!=1){	
           if(p==i+1 || p==i+2){
        	   break;
           }
           
           i++; 
        }
        
       // backword reading
       
        int j=0;
        int temp=n;
        while(n!=p) {
        	
        	if(temp%2==0){
        		 
        		 if(p==n-1 || p==n-2){
        			 break;
        		 }
        		 j++;
        	}
        	else{
        		  if(p==n-1){
        			  break;
        		  }
        		 j++;
        		
        	}
        	 n--;		        
        }
          
       int minValue=Math.min((p/2), (n-p)/2);
       
       System.out.println(minValue);
        
        
        // your code goes here
    }

}
