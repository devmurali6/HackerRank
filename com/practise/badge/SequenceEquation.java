package com.practise.badge;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenceEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[]=new int[n+1];
        int val=0;
        int temp=0;
        
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(0);
        
        for(int i=1; i <= n; i++){
        	temp=in.nextInt();
            a[i] = temp;
            b.add(i, temp);
        }
        
        for (int i = 1; i < a.length; i++) {
        	
        	 /*  val = b.indexOf(i);
        	         System.out.println(b.indexOf(val));*/
        	
        	for (int j = 1; j < a.length; j++) {
        	
        		 if(i==a[j]){
        			 
          		      val= b.indexOf(j);
          		    
          		  System.out.println(val);  
          	   }

			}

		}

	}

}
