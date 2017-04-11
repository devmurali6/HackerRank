package com.practise.hackerrank.algorithms.Impl;

import java.util.Scanner;

public class MiniMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long tempArr[] = new long[5];
		long minVal = 0;
		long maxVal = 0;
	

		for (int i = 0; i < 5; i++) {

			tempArr[i] = in.nextLong();
		}

		for (int i = 0; i < 5; i++) {

			long sum = 0;

			for (int j = 0; j < tempArr.length; j++) {

				if (j != i) {

					sum += tempArr[j];
				}

			}

			System.out.println(sum);
		
			
			if (sum > maxVal) {
				maxVal = sum;
			}
			if (sum < minVal || minVal==0) {
				minVal = sum;
			}
			
		}

		System.out.println(minVal + " " + maxVal);

	}

}
