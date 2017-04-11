package com.practise.hackerrank.trailday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BitWiseAnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int t = in.nextInt();
		
	
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int maxValue = 0;
			
			for (int i = 1; i < n; i++) {

				for (int j = i + 1; j <= n; j++) {

					int operation = i & j;
					
					

					if (operation < k && operation>maxValue) {

						maxValue = operation;   
					}
				}
			
			}
			
			System.out.println(maxValue);
			
		}
		
		
	}



}
