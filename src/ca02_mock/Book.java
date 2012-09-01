package ca02_mock;

/*
Book.java
Author: David Byrne
Date: 01/06/2012
Descrip: MockCA02 - Book Class for our Library Mock
*/

public class Book {

	//////////////////////////////
	//////// Attributes //////////
	//////////////////////////////

	private String title;
	private int numPages;
	private String author;
	private String genre;
		// Can be represented by an integer (long) but usually with -s to separate groupings of digits thus String.
	private String ISBN;
	private Boolean onLoan;
	private Library library;


	//////////////////////////////
	//////// Constructors ////////
	//////////////////////////////

	// Default:
	public Book() {
		this.title = "No title";
		this.numPages = 0;
		this.author = "No author";
		this.genre = "No genre";
		this.ISBN = "No ISBN";
		this.onLoan = false;
		this.library = null;
	}

	// Overloaded - All vars:
		// onLoan ommited from input as any new book cannot be out on loan
	public Book(String title, int numPages, String author, String genre, String ISBN, Library library) {
		this.title = title;
		this.numPages = numPages;
		this.author = author;
		this.genre = genre;
		this.ISBN = ISBN;
		this.onLoan = false;
		this.library = library;
	}

	//////////////////////////////
	//////// Methods /////////////
	//////////////////////////////

	////// Getters and Setters:

	// title:
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	// numPages
	public int getNumPages() {
		return this.numPages;
	}
	public void setNumPages(int pages) {
		this.numPages = pages;
	}
	// author
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	// genre
	public String getGenre() {
		return this.genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	// ISBN
	public String getISBN() {
		return this.ISBN;
	}
	public void setISBN(String isbn) {
		this.ISBN = isbn;
	}
	// onLoan
	public Boolean getOnLoan() {
		return this.onLoan;
	}
	public void setOnLoan(Boolean loan) {
		this.onLoan = loan;
	}
	// library
	public Library getLibrary() {
		return this.library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}


	////// Main methods:

	// Take out a book
	public void Borrow() {
		if(onLoan) {
			System.out.println("==============================");
			System.out.println("Sorry, \"" +this.title+ "\" is not currently available.\n\tPlease check back again soon.");
			System.out.println();
		}
		else {
			this.onLoan = true;
			System.out.println("==============================");
			System.out.println("You have sucessfully taken out \"" +this.title+ "\" by " +this.author+ ".\n\tEnjoy!");
			System.out.println();
		}
	}
	// Return a book
	public void Return() {
		this.onLoan = false;
		System.out.println("==============================");
		System.out.println("Thank you for returning \"" +this.title+ "\".\n  We hope you didn't damage it too much...");
		System.out.println();
	}

	// Display a book's info
	public void Display() {
		System.out.println("==============================");
		System.out.println("Title:\t" +this.title);
		System.out.println("Author:\t" +this.author);
		System.out.println("Genre:\t" +this.genre);
		System.out.println("ISBN:\t" +this.ISBN);
		System.out.println();
		System.out.print("You can find this book in:\n\t\t\"" +this.library.getName() +"\"");
		System.out.println("\tat " +library.getAddress());
		System.out.println();
		if(this.onLoan) {
			System.out.println("This book is currently loaned out to another reader.");
			System.out.println();
		}
		else {
			System.out.println("This book is currently available.");
			System.out.println();
		}

	}

}