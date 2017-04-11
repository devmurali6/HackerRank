package com.practise.hackerrank.trailday;

import java.awt.List;

public class Generics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
	}

	private static <T> void printArray(T[] a) {
		
		 for(T element : a) {
	         System.out.printf("%s ", element);
	      }
	
	}

}
