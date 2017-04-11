package com.practise.badge;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int count=1;
        int max=0;
        Arrays.sort(a);
        for (int i = 0; i < n-1; i++) {
        	
        	if ((Math.abs(a[i] - a[i + 1]) <= 1)) {	
				    	for (int j = i+1; j < n; j++) {
				    		
				    		int temp= Math.abs(a[i]-a[j]);
				
				    		   if( temp<=1  || a[i]==a[j] ){
				    			   
				    			//  System.out.println(a[i]+" " +a[j]);
				    			   count++;
				    			   
				    		   }
				    		
						    }
        	}
        	
        	if(count>max){
                max=count;
            }
             count=1;
			
		}
        System.out.println(max);
    }

}
