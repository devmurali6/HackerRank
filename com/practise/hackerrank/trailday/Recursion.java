package com.practise.hackerrank.trailday;

import java.util.Scanner;

public class Recursion {
	
	 public static void main(String[] args) {
		 
		   Scanner sc = new Scanner(System.in);    	
	    	int num = sc.nextInt();
	        int result=factoral(num);
	        System.out.println(result);
	    	 
	  }
	 
	 public static int factoral(int num){
		 
		 if(num<=1){
			 return 1;
		 }else{
			 return (num*factoral(num-1));
		 }
		
	 }
}
