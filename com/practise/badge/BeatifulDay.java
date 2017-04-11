package com.practise.badge;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class BeatifulDay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		int noOfdays = 0;

		do {

			int revNum = reverseNumber(i);

			if ((i - revNum) % k == 0) {

				System.out.println("reversenumber" + revNum);

				noOfdays++;
			}
			i++;
		} while (i <= j);

		System.out.println(noOfdays);

	}

	public static int reverseNumber(int number) {

		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;
	}

}
