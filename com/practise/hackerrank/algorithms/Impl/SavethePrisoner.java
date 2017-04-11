package com.practise.hackerrank.algorithms.Impl;

import java.util.Scanner;

public class SavethePrisoner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int N = in.nextInt();
            int M = in.nextInt();
            int S = in.nextInt();
            int val=(S+M-1)%N;
            if(val ==0){
                System.out.println(N);
            }else{
                System.out.println(val);
            }
	
        }
        
	}

}
