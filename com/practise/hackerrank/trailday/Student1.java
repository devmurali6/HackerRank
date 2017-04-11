package com.practise.hackerrank.trailday;
import com.practise.hackerrank.trailday.Person1;;

class Student1 extends Person1{
	
	

	private int[] testScores;
	
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	public Student1 (String firstName, String lastName, int id, int[] testScores2) {
	
		
		super(firstName, lastName, id);
		this.testScores=testScores2;
		
		// TODO Auto-generated constructor stub
	}
	
	//Person1 p=new Person1(firstName, lastName, idNumber);
	
	
	
	public  char calculate(){
		
		int n=testScores.length;
		int sum=0;
	
		for(int i=0;i<n;i++)
		{
			sum+=testScores[i];
			
		}	
		
		int avg=(sum/n);
		
		System.out.println("avg" +avg+"sum"+sum+"length"+n);
		
	      if(avg>=90 && avg<=100){
	    	  return 'O' ;
	      }
	      else if(avg>=80 && avg<90){
	    	  return 'E';
	    	  
	      }
	      else if(avg>=70 && avg<80){
	    	  return 'A';
	    	  
	      }
	      else if(avg>=55 && avg<70){
	    	  return 'P';
	    	  
	      }
	      else if(avg>=40 && avg<55){
	    	  return 'D';
	    	  
	      }
	      else{
	    	  return 'T';
	      }
		
		
	}

	
   
}
