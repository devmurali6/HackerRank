package com.practise.badge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ClimbLeaderBoard {

	/**
	 * @param args
	 */
	 /*public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] scores = new int[n];
	        ArrayList<Integer> arrScores=new ArrayList<Integer>();
	        
	        for(int scores_i=0; scores_i < n; scores_i++){
	        	int temp=in.nextInt();
	        	arrScores.add(temp);
	        	scores[scores_i] =temp;
	          
	        }
	        
	      
	        
	        for (int i = 0; i < scores.length; i++) {
	        	
                if(arrScores.indexOf(scores[i]) == -1){
                  arrScores.add(scores[i]);	 
                }
			}
	        
	        
	        
	        int m = in.nextInt();
	        int[] alice = new int[m];
	        for(int alice_i=0; alice_i < m; alice_i++){
	        	int temp=in.nextInt();
	        	 findRank(temp,arrScores);
	            alice[alice_i] = temp;      
	        }
	        
	    }

	private static void findRank(int temp, ArrayList<Integer> arrScores) {
		
		arrScores.add(temp);
		
		Set<Integer> setArr=new TreeSet<Integer>(arrScores);
		
		arrScores= new ArrayList<Integer>(setArr);
		Collections.sort(arrScores, Collections.reverseOrder());
		if(arrScores.indexOf(temp)== -1){
			arrScores.add(temp);
			Collections.sort(arrScores, Collections.reverseOrder());
          }
		System.out.println(arrScores.indexOf(temp)+1);
		 
	}
	*/
	
	 public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    TreeSet<Integer> tree = new TreeSet<Integer>();
	    for(int i =0;i<n;i++){
	        tree.add(in.nextInt());
	    }
	    int m = in.nextInt();
	    int score;
	    int rank=tree.size()+1;
	    for(int i=0;i<m;i++){
	        score = in.nextInt();
	        while(score>=tree.first()){
	            if(rank>1) rank--;
	            if(tree.first()!=tree.last()) tree.remove(tree.first());
	            else break;
	        }
	        System.out.println(rank);
	    }
	}
	

}



/*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];       
        ArrayList<Integer> l=new ArrayList<>();
        int p=0;
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
            if(p!=scores[scores_i]){
                l.add(scores[scores_i]);
            }
            p=scores[scores_i];
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        int r=l.size();
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
            for(int i=r-1;i>=0;i--){
                if( l.get(i)>alice[alice_i]){
                    r=i+2;
                    l.add(alice[alice_i]);
                    System.out.println(r);
                    break;
                }
                else if(l.get(i)==alice[alice_i]){
                    r=i+1;
                    System.out.println(r);
                    break;
                }
                else if(alice[alice_i]>=l.get(0)){
                    r=1;
                    System.out.println(r);
                    break;
                }
                else{    
                    continue;
                }           
            }
            
        }
    }
*/






