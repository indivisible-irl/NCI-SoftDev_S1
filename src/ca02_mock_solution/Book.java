package ca02_mock_solution;

/*
 * Book.java
 * Written by: Jonathan
 * Description: A class to represent a book.
 * Written on: 01/06/12
 */


public class Book {
	//data members
	
	/*
	 * These are the data members that the book class has.
	 * The data members describe the data and information
	 * associated with a book.
	 * 
	 */
	private String title;
	private int pages;
	private String author;
	private long isbn;
	boolean onLoan;
	//a book is associated with a library so a library object is one of the data members.
	//this data member stores the library that the book belongs to.
	Library library;
	
	//constructors
	
	//default constructor to initialize all data members to a default state
	public Book(){
		this.title = "No title";
		this.pages = 0;
		this.author = "No author";
		this.isbn = 0;
		this.onLoan = false;
		this.library = null;		
	}

	//overloaded constructor to accept values for each of the data members and sets them
	public Book(String title, int pages, String author, long isbn, boolean onLoan, Library library) {
		this.title = title;
		this.pages = pages;
		this.author = author;
		this.isbn = isbn;
		this.onLoan = onLoan;
		this.library = library;
	}	
	
	//methods
	
	//getter and setter methods for data members
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public boolean getOnLoan() {
		return onLoan;
	}
	
	public void setOnLoan(boolean onLoan) {
		this.onLoan = onLoan;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}
	

}
