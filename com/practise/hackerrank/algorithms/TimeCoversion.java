package com.practise.hackerrank.algorithms;

import java.util.Scanner;

import org.apache.commons.codec.binary.StringUtils;

public class TimeCoversion {
	
	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
		String time = in.next();

		String[] timetemp = time.split(":");

		int hours = Integer.parseInt(timetemp[0]);
		int minutes = Integer.parseInt(timetemp[1]);

		String secpm = timetemp[2];

		int secs = Integer.parseInt(secpm.substring(0, 2));
		String ampm = secpm.substring(2, 4);

		if ((hours == 12) || (hours == 24)) {
			if (ampm.equals("AM")) {
				
				String hh="00";
				System.out.println( hh + ":" + timetemp[1] + ":"+ secpm.substring(0, 2));
			
			} else if (ampm.equals("PM")) {
				
				String hh = "12";
				System.out.println( hh + ":" + timetemp[1] + ":"+ secpm.substring(0, 2));
			}
		} else {

			if (hours < 12 && ampm.equals("AM")) {

				System.out.println( timetemp[0] + ":" + timetemp[1] + ":"+ secpm.substring(0, 2));
			} else {

				hours += 12;
				
				

				System.out.println( hours + ":" + timetemp[1] + ":"+ secpm.substring(0, 2));
			}

		}

	

	}

}
