package com.practise.hackerrank.interview;

import java.util.Scanner;

public class Anagrams {

	public static int numberNeeded(String first, String second) {
		
	
	        int count = 0;
	        int[] freq = new int[26];
	        for (char c : first.toCharArray()) {
	        	freq[c - 'a']++;
	                	
	        }
	        
	        for (char c : second.toCharArray()){
	        	
	        	freq[c - 'a']--;
	        }
	        for (int i : freq) count += Math.abs(i);
	        return count;
	    
		
		
		/*int count=0;
		int delLength=0;
		char temp='*';
		
		StringBuilder first = new StringBuilder(first1);
		StringBuilder second = new StringBuilder(second1);
		
		
		for(int i=0;i<first.length();i++){
			
			for(int j=0;j<second.length();j++){
						
				String firstS=Character.toString(first.charAt(i));
				String secondS=Character.toString(second.charAt(j));
				
				if( firstS.equals(secondS)&& !firstS.equals("*") && !secondS.equals("*") ){
				  
					 count++;
					 
					 System.out.println("fiorst----" +first.charAt(i)+"---second---"+second.charAt(j));
					 
					 first.setCharAt(i,'*');
					 second.setCharAt(j,'*');
					
				}
			}
		}
		
		
		System.out.println("fiorst----" +first+"---second---"+second);
		System.out.println("count--" +count+"first --"+first.length()+"secont---"+second.length());
		
		delLength=((first.length()+second.length())- 2*(count));
		return delLength;*/
		
	      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

}
