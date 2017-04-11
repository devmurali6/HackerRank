package com.practise.hackerrank.trailday;

import java.util.Arrays;
import java.util.Scanner;

public class Difference {
	
	private int[] elements;
  	public int maximumDifference;

	public Difference(int[] a) {
		
		this.elements=a;
	}
	public void computeDifference() {
		
		/*int value=0;
		int k=0;
		
		int templength=factorial(elements.length);
		
		System.out.println("templengtth" +templength);
		
		int[] temparr=new int[templength];
		
		for(int i=0;i<elements.length;i++){
			
			for(int j=i;j<elements.length-1;j++){
				
				value=Math.abs(elements[i]-elements[j+1]);
				
				System.out.println("values is" +value);
				 
			    temparr[k]=value;
			    k++;
			}
			
		}
		
		Arrays.sort(temparr);
		maximumDifference=temparr[templength-1];*/
			
		    int n = elements.length;    
		    Arrays.sort(elements);
		    maximumDifference = elements[n-1] - elements[0];
		
		
	}
	

	private int factorial(int i) {
		
		if(i<=2){
			return 1;
		}
		else {
			return ((i-1)+factorial(i-1));
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}
