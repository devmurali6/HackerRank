package com.practise.hackerrank.trailday;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diction_Map {
	
	 public static void main(String []argh){
		 Map<String, Long> m1 = new HashMap(); 
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
	        for(int i = 0; i < n; i++){
	        	
	            String name = in.next();
	            long phone = in.nextLong(); 
	            // Write code here
	            m1.put(name, phone);
	            
	        }
	       
	        
	        while(in.hasNext()){
	            
	        	String s = in.next();
	            
	        	if(null != m1.get(s)){
	        	
	        		System.out.println(s+"="+m1.get(s));
	        	}
	        	else{
	        		System.out.println("Not found");
	        	}
	            
	        }
	        in.close();
	    }
	
	
	
	
	

}
