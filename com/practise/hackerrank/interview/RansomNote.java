package com.practise.hackerrank.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {

	Map<String, Integer> magazineMap = new HashMap<String, Integer>();
    Map<String, Integer> noteMap =  new HashMap<String, Integer>();
    
    
   
    
    public RansomNote(String magazine, String note) {
    	
     String[] magaz=magazine.split(" ");
     String[] not=note.split(" ");
     
     Arrays.sort(magaz);
     Arrays.sort(not);
     
   
     Map<String,Integer> wordCount = new HashMap<String, Integer>();
     
   
     
     for(String word : magaz){
         if(wordCount.get(word) != null)
             wordCount.put(word,wordCount.get(word)+1);
         else wordCount.put(word,1);
     }
     
     boolean  notFound = false;
     for(String word : not){
    	 
         if(wordCount.get(word) != null &&  wordCount.get(word) >0)
             wordCount.put(word,wordCount.get(word)-1);
         else{
             notFound = true;
              break;
          }               
    
     }
     
     solve(notFound);

    }
    
    public void solve(boolean flag) {
    	
    	if(flag)
    	    System.out.println("No");
    	    else
    	    System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        /*boolean answer = s.solve(true);
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");*/
      
    }

}
