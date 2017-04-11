package com.practise.hackerrank.trailday;

import java.util.Scanner;

public class RunningTimeCompx {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		int numScores = sc.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = sc.nextInt();
		}
		
		for(int j=0;j<numScores;j++){
				
            int number=testScores[j];
            boolean isPrime=true;
            
            
               if(number==1){
            	   
            	   isPrime=false;
            	  
            	   
               }
               
               if(number==2){
            	  
            	   isPrime=true;
               }
               
            	for(int k=2;k<=number/2;k++){
    				
    				if(number%k==0){
    					
    					isPrime=false;
    				      break;	
    					 
    				}	
    		    }	

            	
            
            
			if(isPrime){
				System.out.println("Prime");
				
			}
			else{
				System.out.println("Not Prime");
				
			}
		}
		
	}
}	

	


	

