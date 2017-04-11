package com.practise.hackerrank.trailday;

import java.util.Scanner;
import com.practise.hackerrank.trailday.Book;

public class MyBook extends Book {
	
    int book_Price=0;
	public MyBook(String title, String author, int price) {
		 super(title,author );
		 this.book_Price=price;
	  
	}
	@Override
	void display() {
		
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+book_Price);
	
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String []args)
	   {
	      Scanner sc=new Scanner(System.in);
	      String title=sc.nextLine();
	      String author=sc.nextLine();
	      int price=sc.nextInt();
	      Book new_novel=new MyBook(title,author,price);
	      new_novel.display();
	      
	   }
	

}
