package lab03;

/*
file:		StudentApplication.java
author:		David Byrne
date:		14/06/2012
descrip:	Application to make use of our Student class
*/

public class StudentApplication	{
	public static void main(String args[]) {

		/////////////////////////////////////////////////////////////////////////////////
		// Set up
		/////////////////////////////////////////////////////////////////////////////////


		// Make some students
		Student student0 = new Student();
		Student student1 = new Student(1, "Joe", "Bloggs", "test@fine.com");

		student0.set_id(2);
		student0.set_fName("Email");
		student0.set_sName("Bad");
		student0.set_email("no address here");

		// Print their details
		student0.display();
		student1.display();


	}
}