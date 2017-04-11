package com.practise.badge;

import java.util.Scanner;

public class MigrationBirds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] types = new int[n];
		int[] birds = new int[6];
		int maxValue = 0;

		/*for (int types_i = 0; types_i < n; types_i++) {

			birds[in.nextInt()]++;
			

		}

		for (int i = 1; i < birds.length; i++) {

			if (maxValue < birds[i]) {
				maxValue = birds[i];
				System.out.println("index" +i);
			}

		}*/
		
		
        long[] typeCount = new long[5];
        long max = 0;
        int winner = 0;
		for(int types_i=0; types_i < n; types_i++){
            int currentId = in.nextInt();
           long currentCount = ++typeCount[currentId - 1];
            if(currentCount > max) {
                max = currentCount;
                winner = currentId;
            }
            if (currentCount == max) {
                winner = currentId < winner ? currentId : winner;
            }
        }
        System.out.println(winner);
		
		

	}
}
