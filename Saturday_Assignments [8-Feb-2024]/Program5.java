package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.List;

class Book {
	String title;
	String author;
	String isbn;
	
	Book (String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	void display() {
		System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
	}
	
}

public class Program5 {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("To Kill a Mockingbird", "Harper Lee", "1234-5678"));
		books.add(new Book("The Great Gatsby", "Scott Fitzgerald", "1234-5678"));
		books.add(new Book("1984", "George Orwell", "1234-5678"));	
		
		for(Book var : books) {
			var.display();
		}
		
		books.remove(new Book("To Kill a Mockingbird", "Harper Lee", "1234-5678"));
		
		for(Book var : books) {
			var.display();
		}
	}

}
