package com.practise.hackerrank.algorithms.Impl;

import java.util.Scanner;

public class FindDigits {

	/**
	 * @param args
	 */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        int [] actual=null;
        for(int a0 = 0; a0 < t; a0++){
        	
            int n = in.nextInt();
           String s=String.valueOf(n);
            int  i = 0;
            int[] temp= new int[s.length()];
            while ( n != 0) {
                temp[i] = n%10;
                n /= 10;
                i++;
            } 
     
            findCount(temp,s);
        }
           
    }
	private static void findCount(int[] number,String s) {
		
		int count=0;
		int input=Integer.parseInt(s);
		
		for (int i = 0; i < number.length; i++) {
			
				   if( number[i]!=0 && input%number[i]==0 ){
					  count++; 
				   }
			}

		System.out.println(count);
		
	}
}
