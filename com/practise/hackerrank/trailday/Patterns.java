package com.practise.hackerrank.trailday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		List<String> list = new ArrayList();

		for (int a0 = 0; a0 < N; a0++) {

			String firstName = in.next();
			String emailID = in.next();

			final String REGEX = "(\\w)@gmail.com";

			Pattern r = Pattern.compile(REGEX);
			Matcher m = r.matcher(emailID);

			if (m.find()) {

				list.add(firstName);
			}
		}
		Collections.sort(list);

		for (String name : list) {
			System.out.println(name);
		}
	}

}
