package com.practise.hackerrank.trailday;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class BSTNode{
    BSTNode left,right;
    int data;
    
    BSTNode(int data){
        this.data=data;
        left=right=null;
    }
}


class BST {
	


	/*public static int getHeight(Node root){
		
		
		int heightLeft = 0;
	    int heightRight = 0;

	    if (root.left != null) {
	        heightLeft = getHeight(root.left) + 1;
	    }
	    if (root.right != null) {
	        heightRight = getHeight(root.right) + 1;
	    }

		
		System.out.println("heightLeft"+heightLeft);
		System.out.println("heightRight"+heightRight);

		return  Math.max(heightLeft,heightRight);
	      
	   // return 0;
	    }*/
	
	
/*	static void levelOrder(Node root){
		
		Queue queue = new LinkedList();
		 queue.add(root);
		 
		 while(!queue.isEmpty()){
			 
		Node  current=(Node) queue.remove();
		System.out.print(current.data+" ");
		if(current.left!=null){  queue.add(current.left);  }
		if(current.right!=null){ queue.add(current.right);  }
		
		 }
		for(int i=0;i<=queue.size();i++){
			
			System.out.print(queue.remove());
		}

	
	}*/
	
	static boolean checkBST(BSTNode root) {

		Queue queue = new LinkedList();
		
		boolean flag=true;

		queue.add(root);

		while (!queue.isEmpty()) {

			BSTNode current = (BSTNode) queue.remove();

			//System.out.print(current.data + " ");

			if (current.left != null) {

				queue.add(current.left);

				
				  if( !(current.left.data<=current.data)){ flag=false; break;  }
				 
				   System.out.println("left nodes"+current.left.data);
				 

			}

			if (current.right != null) {

				queue.add(current.right);

				
				  if( !(current.right.data>current.data)){ flag=false; break;  }
				  System.out.println("right nodes" +current.right.data);
				 

			}

		}
		
		
		if(flag=true){
			return true;
		}
		else{
			return false;
		}

		/*for (int i = 0; i < queue.size(); i++) {

			System.out.print(queue.remove());
		}*/
		
		
	

	}
		  
	
	public static BSTNode insert(BSTNode root,int data){
        if(root==null){
            return new BSTNode(data);
        }
        else{
            BSTNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            BSTNode root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            
            
            boolean flag =checkBST(root);
            
            System.out.println("flag"+flag);
             // levelOrder(root);
            //int height=getHeight(root);
            //System.out.println(height);
        }

}
