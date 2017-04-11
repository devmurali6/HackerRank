package com.practise.badge;

import java.util.Arrays;
import java.util.Scanner;

public class MarcsCupcake {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        long walkCalorie=0;
        int temp=0;
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        
        }

        Arrays.sort(calories);
        
        for (int i =calories.length -1; i >= 0; i--) {

        	walkCalorie=(long) ( walkCalorie + (calories[i] *(Math.pow(2,temp))  ) );
        	
        	temp++;
		}
        
        System.out.println(walkCalorie);
        
    }

}
