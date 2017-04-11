package com.practise.hackerrank.trailday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int n = in.nextInt();
		int count = 0;
	
		int temp = 0;

		while (n > 0) {

			int remainder = n % 2;

			if (remainder == 1) {
				count++;

			}
			else  {
				count = 0;

			}

			if (0 < count && count > temp) {
				temp = count;
			}

			n = n / 2;

		}

		System.out.println(temp);
		
		String[] ones = Integer.toBinaryString(n).split("[0]+");
		
		for (String s : ones) {
            
			System.out.println(ones);
        }
	

	}
	
	

}
