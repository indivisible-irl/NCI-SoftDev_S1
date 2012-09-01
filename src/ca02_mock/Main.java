package ca02_mock;

/*
Main.java
Author: David Byrne
Date: 01/06/2012
Descrip: MockCA02 - Main Class for our Library Mock
*/

public class Main {

	public static void main(String args[]) {

		//// create my very own library
			// For ref: (String name, String address, long phone, int numBooks)
			//			numBooks is optional as there are 2 overloaded constructors
		Library myLibrary = new Library("Dave's Pile O' Books", "123 Fake St.", 892589631);

		//// make a few books to put into that vast empty space
		// using default constructor here:
		Book nullBook = new Book();
		// overloaded constructor for these ones:
		// For ref: (String title, int numPages, String author, String genre, String ISBN, Library library)
		Book javaBook = new Book("Java for Silly Billies", 3241, "Bloggs, Joe, Esquire", "Programming", "817525766-0", myLibrary);
		Book teachingBook = new Book("How to Murder your Lecturer in 6 Easy Steps", 16, "Keane, Deirdre", "Self Help", "012345678-9", myLibrary);

		// set attributes for nullBook:
		nullBook.setTitle("Don't Panic!");
		nullBook.setNumPages(224);
		nullBook.setAuthor("Adams, Douglas");
		nullBook.setGenre("Deep Thought");
		nullBook.setISBN("0-671-62964-6");
		nullBook.setLibrary(myLibrary);


		//// Start using these books

		// Welcome our budding readers:


		// Show our books' details for tha fun:
		nullBook.Display();
		javaBook.Display();
		teachingBook.Display();

		// Let's take them all out:
		nullBook.Borrow();
		javaBook.Borrow();
		teachingBook.Display();

		// And again; hopefully with errors:
		nullBook.Borrow();
		javaBook.Borrow();
		teachingBook.Display();

		// And now we'll give them all back (in various conditions.....):
		nullBook.Return();
		javaBook.Return();
		teachingBook.Return();


	}

}