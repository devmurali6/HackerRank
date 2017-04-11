package com.practise.badge;

import java.util.Scanner;

public class CloudRevisted {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        int intial=0;
        int Energy=100;
        int jump;
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
     
		   do {
			   
			   jump=((intial+k)%n); 
		    	 if(c[jump]==1){
		    		 Energy=Energy-1-2; 
		    	 }
		    	 if(c[jump]==0){
		    		 Energy=Energy-1;
		    	 } 
		      intial=jump;	 
		        	 
		     } while( !(jump==0));
  
		   System.out.println(Energy);
    }
	

}
