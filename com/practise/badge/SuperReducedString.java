package com.practise.badge;

import java.util.Scanner;

public class SuperReducedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		 String input=in.next();		
		 StringBuffer buffer = new StringBuffer(input);
		 
		
		if(buffer.equals(null))
        {
         System.out.println("Empty String");
         }
           else{ 
			
			 for (int i=1; i < buffer.length(); i++) {
				  
				  if(buffer.charAt(i)==buffer.charAt(i-1)){
					    buffer.deleteCharAt(i);
			            buffer.deleteCharAt(i-1);
					    i=0;
				  }	
		      }
           }
			 
	     input=buffer.toString();
	        
		 String result=buffer.length()==0?  "Empty String":input;
		 
		 System.out.println(result);
		

	}

}
