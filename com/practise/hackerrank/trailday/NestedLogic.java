package com.practise.hackerrank.trailday;

import java.util.Scanner;

public class NestedLogic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);

		    int Da = scan.nextInt();
		    int Ma = scan.nextInt();
		    int Ya = scan.nextInt();
		    int De = scan.nextInt();
		    int Me = scan.nextInt();
		    int Ye = scan.nextInt();

		int fine = 0;

		scan.close();

		
		if (Ye >= Ya && Me >= Ma &&  De >= Da) {

			System.out.println(fine);
		}
		
		else {
			if (Da > De){
				
				fine = 15 * (Da - De);
				System.out.println(fine);
			}
			else if (Me < Ma) {

				fine = 45 * ((Ma - Me));
				System.out.println(fine);
			}
			

			else if (Ya>Ye) {
				System.out.println(1000);
			}
				
			
		}		

	}

}
