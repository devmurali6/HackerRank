package com.practise.badge;

import java.util.Scanner;

public class GradeSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int result = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int grade = in.nextInt();

			result = calGrade(grade);

			System.out.println(result);

			// your code goes here
		}
	}

	private static int calGrade(int grade) {

		int tempResult = 0;

		int newGrade = grade + (5 - (grade % 5));

		if (grade < 38) {

			tempResult = grade;
		}

		else if ((newGrade - grade < 3)) {
			tempResult = newGrade;
		} else {
			tempResult = grade;
		}

		return tempResult;

	}

}
