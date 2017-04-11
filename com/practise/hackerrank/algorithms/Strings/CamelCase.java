package com.practise.hackerrank.algorithms.Strings;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        String s = in.next();
        
        String[] r = s.split("(?<=.)(?=\\p{Lu})");
        System.out.println(r.length);
        System.out.println(Arrays.toString(r));
        
             
   
	}

}







