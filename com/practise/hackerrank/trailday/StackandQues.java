package com.practise.hackerrank.trailday;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackandQues {
	
	
	Stack stk=new Stack();
	Queue queue = new LinkedList();
	
	
	public void pushCharacter(char val){
		
		stk.push(val);
	}
	
	public char popCharacter(){
		
		char popchar=(Character) stk.pop();
		
		return popchar;
	}
	
	private void enqueueCharacter(char c) {
		
		queue.add(c);
	}
	
	private char dequeueCharacter() {
		   
		  char quechar= (Character) queue.remove();
		return quechar;
	}
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        scan.close();

	        // Convert input String to an array of characters:
	        char[] s = input.toCharArray();

	        // Create a Solution object:
	        StackandQues p = new StackandQues();

	        // Enqueue/Push all chars to their respective data structures:
	        for (char c : s) {
	            p.pushCharacter(c);
	            p.enqueueCharacter(c);
	        }

	        // Pop/Dequeue the chars at the head of both data structures and compare them:
	        boolean isPalindrome = true;
	        for (int i = 0; i < s.length/2; i++) {
	            if (p.popCharacter() != p.dequeueCharacter()) {
	                isPalindrome = false;                
	                break;
	            }
	        }

	        //Finally, print whether string s is palindrome or not.
	        System.out.println( "The word, " + input + ", is " 
	                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	    }

	

	

}
