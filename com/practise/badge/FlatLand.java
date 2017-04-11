package com.practise.badge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FlatLand {

	/**
	 * @param args
	 */
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int c[] = new int[m];
	         HashSet<Integer> stations = new HashSet<Integer>(m);
	        // HashSet<Integer> cities = new HashSet<Integer>(n);
	        // List<Integer> distance=new ArrayList<Integer>();
	         
	        List<Integer> list=null;
	        List<Integer> list1= new ArrayList<Integer>();
	        for(int c_i=0; c_i < m; c_i++){
	            int temp = in.nextInt();
	            c[c_i] = temp;
	           // stations.add(temp);
	        }
	        
	        int count=0;
	        
	        if(n!=m){
	        	
	        	for (int i = 0; i <n; i++) {
	        		list= new ArrayList<Integer>();
	        
	        		
	        		 int prev=999999;
	        	
	        	     for (int j = 0; j < c.length; j++) {
	        	    	 
	        	    
	        	    	     /*if(!stations.contains(i) ){*/
	        	    	    	 
	      
	        	    	    	 int curr=Math.abs(i-c[j]);
	        	    	    	  prev=Math.min(prev, curr);
	        	    	    	  //list.add(curr);	        	    	    	  
	        	    	/*     }*/

					} 
	        	     
	        	     count=Math.max(count,prev);
	        	     
	        	     /*if(!list.isEmpty()) {
	        	    	 Collections.sort(list);
	        	    	 int min=list.get(0);
	  	        	   	list1.add(min);
	        	    	 
	        	     }*/

				}
	        	/*if(!list1.isEmpty()){
	        		Collections.sort(list1);
		        	count=list1.get(list1.size()-1);
	        	}*/
	        
	        	System.out.println(count);        	
	   	    }
	        else{
	        	 System.out.println(count);
	        }   	
	    }
}
