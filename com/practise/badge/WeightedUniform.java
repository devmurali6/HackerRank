package com.practise.badge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class WeightedUniform {

	
	
	static List<Integer> tot=new ArrayList<Integer>();
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        HashSet<Integer> weights = getWeights(s);
        int n = in.nextInt();

        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            String finalRes = (weights.contains(x)) ? "Yes" : "No";
			System.out.println(finalRes); 
              
        }

    }
	
	
   	private static HashSet<Integer> getWeights(String s) {
		// TODO Auto-generated method stub
   		
   		HashSet<Integer> weight = new HashSet<Integer>();
   	    
   		int w = 0;
   	    char prev = ' ';
   		for (int i = 0; i <s.length(); i++) {
        	
        	char curr = s.charAt(i);
            if (curr != prev)
            {
                w = 0;
            }
            w += curr - 'a' + 1;
            weight.add(w);
            prev = curr;
	 }
   		return weight;
 
	}

	
	
}


/*
private static void findFinalResult(int[] input, List<Integer> tot2) {

	for (int i = 0; i < input.length; i++) {
		int val = input[i];
		String finalRes = (tot.indexOf(val) >= 0) ? "Yes" : "No";
		System.out.println(finalRes);
	}
}*/



  /*    for (int i = 0; i <s.length(); i++) {

			String s1=new String(Character.toString(s.charAt(i)));
			if( i>1  && charArr[i]==charArr[i-1]){
					s1=s1.concat(result.get(result.size()-1));
				result.add(s1);
			}
			else{
				
				result.add(s1);
				
			}

		 ascii =  (int)(s1.length()* ((s1.charAt(0)-97+1)));	
		 tot.add(ascii);
		
		}
*/