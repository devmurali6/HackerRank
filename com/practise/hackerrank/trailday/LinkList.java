package com.practise.hackerrank.trailday;

import java.util.ArrayList;
import java.util.Scanner;


class Node{
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}


class Solution {
	
	  public static Node insert(Node head,int data) {
	  if(head==null){
	  return new Node(data); }
	  head.next=insert(head.next,data);
	  return head;
	 }
	 
	
/*	public static Node removeDuplicates(Node head) {
		
		
			Node curr=head;
			
			while(curr.next!=null){
				
			    if(curr.data==curr.next.data){
			    	
			    	curr.next=curr.next.next;
			    	
			    }
			    else
			    {
			    	curr=curr.next;
			    }
				
			}
		
		return curr;
			
	}	*/
	
	
}


    



public class LinkList extends Solution {
	

	  public static  Node insert(Node head,int data)
	    {
	        Node p=new Node(data);			
	        if(head==null)
	            head=p;
	        else if(head.next==null)
	            head.next=p;
	        else
	        {
	            Node start=head;
	            while(start.next!=null)
	                start=start.next;
	            start.next=p;

	        }
	        return head;
	    }
	
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
	
	public static boolean hasCycle(Node head) {

		Node tempVar = null;
		ArrayList<Node> Values = new ArrayList<Node>();
		boolean flag = false;

		tempVar = head;
		while (tempVar != null) {
			Values.add(tempVar);
			tempVar = tempVar.next;
			if (Values.contains(tempVar)) {

				return true;
			}

		}

		return flag;

	}
	
	
/*	boolean hasCycle(Node head) {
	    Set<Node> seen = new HashSet<>();
	    while (head != null) {
	        seen.add(head);
	        head = head.next;
	        if (seen.contains(head)) return true;
	    }
	    return false;
	}*/
	
	

   
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            
            head = insert(head,ele);
            
        }
       
        //head=removeDuplicates(head);
        display(head);
        boolean result=hasCycle(head);
        System.out.println("rsult" +result);
        sc.close();
    }
    
    
    
    

}
