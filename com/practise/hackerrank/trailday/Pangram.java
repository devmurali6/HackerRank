package com.practise.hackerrank.trailday;

import java.util.Scanner;

public class Pangram {
	
	
	  public static void main(String[] args) {
		  
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		    
		    String values=new String(" abcdefghijklmnopqrstuvwxyz  ");
		    
		    Scanner sc = new Scanner(System.in);  
		    
		    String fs=sc.nextLine();
		    
		    for(int i=0;i<fs.length();i++){
		    	
		         char temp=fs.charAt(i);
		         
		         String value=(Character.toString(temp)).toLowerCase();
		          
		         if (values.contains(value)){	 
		     
		        	 values=values.replace(value,"");
		        	
		         }
		    }
		    
		    if(values.isEmpty()){
		    	
		    	System.out.println("pangram");
		    	
		    }
		    else{
		    	System.out.println("not pangram");
		    }
		        
	    }

}
