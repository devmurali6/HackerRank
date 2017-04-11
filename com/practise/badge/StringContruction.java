package com.practise.badge;

import java.util.Scanner;

public class StringContruction {

	/**
	 * @param args
	 */
	
	static StringBuilder result = new StringBuilder();
	static StringBuilder soutput;
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
             int cost=minCost(s);
             System.out.println(cost);
     
        }
    }

	private static int minCost(String s) {
		 int cost=0;
		 String org = new String(" ");
		 
		 while(!s.equals(org)|| !s.equals("")){
			 org =s;
			 
			 for(int a0 = 0; a0 <s.length(); a0++){	  
				   //finding match if present in given string or no
				    	 s=s.replaceAll(String.valueOf(s.charAt(a0)),"");
				    	 cost++; 
				     }
		 }
		 
		return cost;
	}
}
