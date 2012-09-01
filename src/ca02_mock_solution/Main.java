package ca02_mock_solution;

/*
 * Main.java
 * Written by: Jonathan
 * Description: The main class containing the main method.
 * This is where the objects will get declared and created and the main
 * functions of the application will run
 * Written on: 01/06/12
 */


public class Main {

	public static void main(String[] args) {

		//declaring and creating a new library object to represent the local library
		//using the overloaded library constructor to give the data members values
		Library localLibrary = new Library("NCI","01-8273287");
		
		//declaring and creating two book objects using the overloaded book constructor.
		//these books are using the localLibrary object as their library data member
		Book book1 = new Book("Pride and Prejudice",300,"Jane Austen",12312389,false,localLibrary);
		Book book2 = new Book("To Kill a Mocking Bird",200,"Harper Lee",73872374,false,localLibrary);
		Book book3 = new Book("The Shining",300,"Stephen King",34234234,false,localLibrary);
		
		//calling the library classes borrowBook behavior for all books
		localLibrary.borrowBook(book1);
		localLibrary.borrowBook(book2);
		localLibrary.borrowBook(book3);
		
		//calling the library classes returnBook behavior for one of the books.
		//this is repeated to test the returnBooks onLoan status check
		localLibrary.returnBook(book1);
		localLibrary.returnBook(book1);
		localLibrary.returnBook(book3);
	}

}
