package com.practise.badge;

import java.util.Arrays;
import java.util.Scanner;

public class DesignPDF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int ascii=0;
		int maxletter=0;
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        
        String word = in.next();
        char[] inputletter=word.toCharArray();   
        for (int i = 0; i < inputletter.length; i++) {
             
        	ascii = (int)inputletter[i];
        	
        	  if(maxletter<h[ascii-97]){
        		  maxletter=h[ascii-97];
        	  }
		}
        
        int area= maxletter*inputletter.length; 
       
        System.out.println(area);
    }

}
