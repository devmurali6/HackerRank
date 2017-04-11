package com.practise.hackerrank.algorithms.Impl;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang.ArrayUtils;

public class SticksCut {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {

			arr[arr_i] = in.nextInt();
		}

		cutSticks(arr);

	}

	private static int[] arr;
	static int min=0;

	public static void cutSticks(int arr1[]) {

		arr = arr1;
		Arrays.sort(arr);
		
		if (arr.length != 0) {
			min = arr[0];
	
		}
		
		for (int j = 0; j < arr.length; j++) {

			arr[j] = arr[j] - min;

		}
		
		if (arr.length != 0) {

			System.out.println(arr.length);
		}

		int len=0;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]!=0){
				len++;
			}
		}
		
		int tempArray[]=new int[len];
		
		for (int i=0, j=0; i<arr.length; i++){
            if (arr[i] != 0) {
            	tempArray[j] = arr[i];
                j++;
            }
        }
		
		if (arr.length != 0) {
			
			cutSticks(tempArray);
		}

	}

}
