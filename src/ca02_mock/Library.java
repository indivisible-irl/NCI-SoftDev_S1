package ca02_mock;

/*
Library.java
Author: David Byrne
Date: 01/06/2012
Descrip: MockCA02 - library Class for our Library Mock
*/

public class Library {

	//////////////////////////////
	//////// Attributes //////////
	//////////////////////////////

	String name;
	String address;
	long phoneNumber;
	int numBooks, numAvailable;

	//////////////////////////////
	//////// Constructors ////////
	//////////////////////////////

	// Default:
	public Library() {
		this.name = "No name";
		this.address = "No address";
		this.phoneNumber = 0;
		this.numBooks = 0;
		this.numAvailable = 0;
	}
	// Overloaded - All except numBooks (ie brand spanking new library)
	public Library(String name, String address, long phone) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phone;
		this.numBooks = 0;
		this.numAvailable = 0;
	}
	// Overloaded - All vars:
	public Library(String name, String address, long phone, int numBooks) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phone;
		this.numBooks = numBooks;
		this.numAvailable = numBooks;
	}

	//////////////////////////////
	//////// Methods /////////////
	//////////////////////////////

	////// Getters and Setters:

	// name:
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// address:
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	// phone number:
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(long phone) {
		this.phoneNumber = phone;
	}
	// number of books in library:
	public int getNumBooks() {
		return this.numBooks;
	}
	public void setNumBooks(int books) {
		this.numBooks = books;
	}


	////// Main methods:

	// Add a book to libray
	public void newBook() {
		this.numBooks = this.numBooks += 1;
	}
	// Destroy/loose a book
	public void removeBook() {
		if(this.numBooks == 0) {
			System.out.println("There are no books left to remove. What a poor library!");
		}
		else {
			this.numBooks = this.numBooks -= 1;
		}
	}

	// Greet our customers
	public void Greet() {
		System.out.println("Welcome, welcome book enthusiast!");
		System.out.println("Welcome to " +this.name+ ".");
		System.out.println("\nPlease peruse our collection and find something that suits your tastes.");
		System.out.println("\nWe currently have " +this.numAvailable+ " books available.");
		System.out.println("==============================");
	}




}