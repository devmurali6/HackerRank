package com.practise.hackerrank.algorithms;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDiff {
	
	public static int leftDaig=0;
	public static int rightDaig=0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        //calculating first diagonal
        
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                if(i==j){
                	leftDaig=leftDaig+a[i][j];
                	
                }
               if(j==2-i){
            	   rightDaig=rightDaig+a[i][j];
               }
            }
        }
        
        System.out.println(Math.abs(leftDaig-rightDaig));
        
    }
}