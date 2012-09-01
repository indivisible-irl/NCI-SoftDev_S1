package ca02_mock_solution;

/*
 * Library.java
 * Written by: Jonathan
 * Description: A class to represent a library.
 * Written on: 01/06/12
 */


public class Library {

	//data members
	
	/*
	 * These are the data members associated with a library.
	 * contact number is a string in this example just so you can
	 * put a zero at the start of the number. using an int or long with
	 * a zero at the start will cause an error. You could use int or long
	 * just without a leading zero.
	 */
	private String address;
	private String contactNumber;
	
	//constructors
	
	//default constructor to initialize all data members to a default state
	public Library(){
		this.address = "No address";
		this.contactNumber = "No number";		
	}

	//overloaded constructor to accept values for each data member and set them
	public Library(String address, String contactNumber) {
		this.address = address;
		this.contactNumber = contactNumber;
	}

	//methods
	
	//getter and setter methods for data members
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	//other behavior methods
	
	//method to fulfill the borrow book behavior
	
	/*
	 * This method accepts a book object and checks whether that book is on loan or not.
	 * If the book is on loan then an error message is displayed but 
	 * if it is not on loan then the books on loan status gets updated to true
	 * and a message is displayed saying you have successfully borrowed the book
	 */
	public void borrowBook(Book book){
		
		//checking the book object that is passed into the method
		//if the on loan status is true the book cannot be borrowed again
		if(book.getOnLoan() == true){
			System.out.println(book.getTitle()+" is already on loan");
		} 
		//if the on loan status is not true then the book can be borrowed
		else {
			//setting the books on loan status to be true.
			//this means the book is now on loan
			book.setOnLoan(true);
			System.out.println("You have successfully borrowed "+book.getTitle());
		}
		
	}
	
	//method to fulfill the return book behavior
	
	/*
	 * This method accepts a book object and checks whether the book is on loan or not.
	 * If the book is on loan then it can be returned to the library and its on loan
	 * status is updated to false. If it is not on loan then it cannot be returned to the 
	 * library because it has not been borrowed.
	 */
	public void returnBook(Book book){
		
		//checking the on loan status and if it is true then the book is on loan and can
		//be returned to the library
		if(book.getOnLoan() == true){
			//setting the on loan status to false.
			//this means the book is now not on loan
			book.setOnLoan(false);
			System.out.println("Thank you for returning "+book.getTitle());
		} else {
			System.out.println(book.getTitle()+" is not on loan");
		}
		
	}

	
}
