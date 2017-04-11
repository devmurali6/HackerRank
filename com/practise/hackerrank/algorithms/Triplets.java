package com.practise.hackerrank.algorithms;

import java.util.Scanner;

public class Triplets {
	
	
	public static int alice=0;
    public static int bob=0;
    //static char a;
    //static char b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
       compare(a0,b0);
       compare(a1,b1);
       compare(a2,b2);
       
       System.out.println(alice+" "+bob);
        
     }
    
    public static void compare(int frst,int sec){
    	
    	 if(frst>sec){
            alice++; 
          }
         else if(frst<sec){

             bob++;
         }
    }
 
}
