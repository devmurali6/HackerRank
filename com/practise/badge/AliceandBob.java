package com.practise.badge;

import java.util.Scanner;

public class AliceandBob {

	/**
	 * @param args
	 */
	
	static long[] moves;
	static int rotations;
	                    
	public static void main(String[] args) {
		int val=0;
		String winner;
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
       
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            // your code goes here
            int[] moves = new int[n+1];
            	  moves[0] = 1;//1->not a prime & 0->prime
	              moves[1] = 1;
               val = primeList(moves,n);   
               winner = (val % 2 == 1) ? new String("Alice") : new String("Bob");
               System.out.println(winner);
        }
    }
	

	
	private static int primeList(int[] moves2, int n) {
		
		{
            int Primes = 0;
            for(int i = 2; i <= Math.sqrt(n); i++)
            {
                if (moves2[i] != 1)
                {
                    for(int j = i * 2; j <= n; j +=i)
                    {
                    	moves2[j] = 1;
                    }
                }
            }
            for(int i=0;i<=n;i++){
                if(moves2[i]==0)Primes++;
            }
            return Primes;
        }
	}



	


	private static int primeList(long[] moves2) {
	
		int
		tempresult=0;
		rotations=0;
		
		for (int i = 1; i <moves2.length; i++) {
	 			
			   if(findPrime(moves[i])!=0) 
			   {
				   tempresult= (int) moves[i];
				    rotations++;
				    
				  
				       
				        for(int j = tempresult * 2; j < moves.length;j +=i)
	                    {
				        	moves[j] = 0;
	                    }
				        
				        
				        
				        /*
				        while (j<moves.length){
				        	
				         if(j<moves.length){
				        	 
				        	 System.out.println(j+"--"+tempresult);
				        	 
				        	   moves[(int) j]=0;
					    	   j++;
					    	   j= (j*tempresult-1) ;
					    	   
					    	   System.out.println("***" +j);
				         }
				    	   
					      
				      } */
				  
			   }  
		}   
		
		return rotations;
	}
		
	private static long findPrime(long i) {
		 for(int j=2;j<i;j++) {
		        if(i%j==0)
		            return 0;
		    }
		    return i;
	}
}
