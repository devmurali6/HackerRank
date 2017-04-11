package com.practise.badge;

import java.util.Scanner;

public class Btw2Sets {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] a = new int[n];
	        int max=1;
	        int min=100;
	        int flag=0;
	        int count=0;
	        for(int a_i=0; a_i < n; a_i++){
	        	
	        	a[a_i] = in.nextInt();
	        	if(a[a_i]>max){
	      		  max = a[a_i];
	      	  }
	            
	            
	        }
	        int[] b = new int[m];
	        for(int b_i=0; b_i < m; b_i++){
	        	
	        	    b[b_i] = in.nextInt();
			        	if(b[b_i]<min){
			      		  min = b[b_i];
			      	  }
	        }
	        
	   for(int i=a[n-1];i<=b[0];i++){
		  
		  for(int j=0;j<n;j++)
		        if((i%a[j])!=0)flag=1;
		    for(int k=0;k<m;k++)
		        if((b[k]%i)!=0)flag=1;
		    if (flag==0)
		        count++;
		    flag=0;
		  
	  }
	  System.out.println(count);
	   	    
	    }

}




