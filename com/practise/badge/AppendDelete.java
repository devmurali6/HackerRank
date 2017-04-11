package com.practise.badge;

import java.util.Scanner;

public class AppendDelete {


	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String t = in.next();
	        int k = in.nextInt();
	        
	        char[] str=s.toCharArray();
	        char[] strMatc=t.toCharArray();
	        
	        int i=0;
	        int j=0;
	        int operCnt=0;
	        
        
	        while (str[i] == strMatc[i] && i < s.length()-1 && i < t.length()-1) {
	            i++;
	        }
	        
	       operCnt=(s.length()+t.length()-2*i);
	        	 
	        
	         String result= ((operCnt <= k && (k - operCnt) % 2 == 0) || s.length() + t.length() < k) ? "Yes":"No";
	         
	         System.out.println(result); 
  
	    }
	 
	 
	 
}


/*
if((numOfMinOperations <= k && (k - numOfMinOperations) % 2 == 0) || s.length() + t.length() < k) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}*/


/*  while( !(s.length()==i) && !(t.length()==j)){
	
	  if(s.charAt(i) == t.charAt(j)){ 
		  matchCnt++;
		  
	  }
	  else{   
		  break;
	  }
	  
	  i++;
	  j++;
}

String strCut=new String("");
int totalOper=0;
if(matchCnt==t.length()){
	
	strCut= new String(t);
	totalOper=strCut.length()+matchCnt+1;
	
}
else{
	 strCut=t.substring(matchCnt,t.length()-1);
	 totalOper=strCut.length()+matchCnt;
}

System.out.println(totalOper);*/
