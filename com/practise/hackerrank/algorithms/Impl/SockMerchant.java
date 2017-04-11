package com.practise.hackerrank.algorithms.Impl;

import java.util.Scanner;

public class SockMerchant {
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        int n = in.nextInt();
        int c[] = new int[n];
        
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        

		for ( int j = 0;  j < c.length-1; j++) {
			
			for(int i=j+1;i<c.length;i++){

				 if(c[j]==c[i]){
					  
					    c[i]=i*010010;
					    c[j]=j*010010;
					    count++;
				        
				        break;
				 }
			}	
		}
		System.out.println(count); 
        
    }

}
