package com.practise.badge;

import java.util.Scanner;

public class MarsExploration {

	/**
	 * @param args
	 */
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int temp=0;
	        int totalNoChars=0;
	        
	        for(int i=0;i<S.length();){
	        	temp=i;
	        	i=i+3;
	        
	        	totalNoChars=totalNoChars+calChange (S.substring(temp,i));
	        } 
	        
	        System.out.println(totalNoChars);
	    }

	private static int calChange(String substring) {
		 int count=0;
		 for (int i= 0; i < 3; i++) {
			 
			 if(i==0 & substring.charAt(i)!='S')
				 count++;
			 if(i==1 & substring.charAt(i)!='O')
				 count++;
			 if(i==2 & substring.charAt(i)!='S')
				 count++;
		}
		 
		return count;
	}

}
