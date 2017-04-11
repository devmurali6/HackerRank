package com.practise.hackerrank.trailday;

import java.util.Scanner;

interface AdvancedArithmetic{
	   int divisorSum(int n);
	}

class Calcul implements AdvancedArithmetic{

	@Override
	public int divisorSum(int n) {
		
		int sum=0;
		for(int i=1;i<=n;i++){
			
			if(n%i==0){
				
				
				
				sum=sum+i;
				System.out.println("i"+i+"sum"+sum);
			}
			
		}
		
		return sum;
	}
	
	
	
}


public class Inter_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calcul(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }

}
