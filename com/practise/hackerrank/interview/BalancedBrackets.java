package com.practise.hackerrank.interview;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

/*	bool is_balanced(string expression) {
		  stack<char> s;
		  for (char c : expression) {
		    if      (c == '{') s.push('}');
		    else if (c == '[') s.push(']');
		    else if (c == '(') s.push(')');
		    else {
		      if (s.empty() || c != s.top())
		        return false;
		      s.pop();
		    }
		  }
		  return s.empty();
		}*/
	
	

	public static boolean isBalanced(String expression) {
		
		
		Stack<Character> stack = new Stack<Character>();
		String expS=new String(expression);
		
		if(expS.length()%2!=0){
			return false;
		}
		
		for (int i = 0; i < expS.length(); i++) {
			
			if(expS.charAt(i)=='(') stack.push(')');
			else if(expS.charAt(i)=='{')stack.push('}');
			else if(expS.charAt(i)=='[')stack.push(']');
			else{
				if(stack.isEmpty()|| expS.charAt(i) !=stack.peek())
				 return false;
				stack.pop();
			}
				
		}
					
		return stack.isEmpty();
		
		

		/*Stack<Character> stack = new Stack<Character>();
		boolean flag = true;

		String temp1 = new String(expression);

		for (int i = 0; i < temp1.length(); i++) {

			System.out.println(temp1.charAt(i));
			stack.push(temp1.charAt(i));
		}

		Object[] arryStck = stack.toArray();

		

		int length = stack.size();

		if ((length % 2) != 0) {
			
			flag = false;
			
		} else {
						
			//System.out.println("haf values" +half);
			
			for (int i = 0; i < (length / 2);i++) {

				int shalf = length - (i + 1);
				char fhalfValue = (Character) arryStck[i];
				char shalfValue = (Character) arryStck[shalf];

				if (fhalfValue == '{' && shalfValue == '}'){
					
					flag = true;
				    continue;
				}
					
				else if (fhalfValue == '[' && shalfValue == ']'){
					
					flag = true;
				    continue;
				}
				
				else if (fhalfValue == '(' && shalfValue == ')'){
					
					flag = true;
				    continue;
				}
					
				else{
					flag = false;
					break;
					
				}
					
				    

			}

		}

		return flag;*/

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
	}

}
