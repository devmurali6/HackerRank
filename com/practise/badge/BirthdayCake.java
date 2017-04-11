package com.practise.badge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCake {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int max=-1;
        int count=0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            
            
        }
        
        Arrays.sort(height);
        max=height[height.length-1];
        
        for (int i = 0; i < height.length; i++) {
			
        	if(max==height[i]){
        		count++;
        	}
		}
        
        System.out.println(count);
        
    }
}
