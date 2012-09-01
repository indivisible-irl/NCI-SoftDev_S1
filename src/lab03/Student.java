package lab03;

/*
file:		Student.java
author:		David Byrne
date:		14/06/2012
descrip:	Student Info Class
*/

//import java.util.regex.*;				// Use this for email verification

public class Student{
	/////////////////////////////////////////////////////////////////////////////////
	// Data members
	/////////////////////////////////////////////////////////////////////////////////
	private int id;
	private String fName, sName, email;
//	private boolean checkEmail;

	// pre-compile regex pattern for an email address and set the matcher.
//	Pattern re_email = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");
//	Matcher m_email = re_email.matcher(this.email);

	/////////////////////////////////////////////////////////////////////////////////
	// Constructors
	/////////////////////////////////////////////////////////////////////////////////
	public Student(){
		// Default constructor
		this.id = 0;
		this.fName = "No name";
		this.sName = "No name";
		this.email = "No email";
//		this.checkEmail = false;
	}

	public Student(int id, String fName, String sName, String email) {
		// Input values supplied
		this.id = id;
		this.fName = fName;
		this.sName = sName;
		this.email = email;
//		this.checkEmail = verifyEmail(this.email);
	}

	/////////////////////////////////////////////////////////////////////////////////
	// Methods:
	/////////////////////////////////////////////////////////////////////////////////

	// Gets & Sets
	public int get_id(){										// id
		return this.id;
	}
	public void set_id(int id){
		this.id = id;
	}
	public String get_fName(){									// first name
		return this.fName;
	}
	public void set_fName(String name){
		this.fName = name;
	}
	public String get_sName(){									// second name
		return this.sName;
	}
	public void set_sName(String name){
		this.sName = name;
	}
	public String get_name(){									// whole name
		String name = sName + ", " + fName;
		return name;
	}
	public String get_email(){									// email
		return this.email;
	}
	public void set_email(String address){
//		if (verifyEmail(address)){
//			this.email = address;
//		}
//		else{
//			System.out.print("Email failed verification");
//		}
		this.email = address;
	}
//	public boolean get_checkEmail(){							// email verification bool
//		return this.checkEmail;
//	}


	// Methods
//	private boolean verifyEmail(String email){
//		if (m_email.find()){
//			System.out.println("Match successful");
//			this.checkEmail = true;
//			return true;
//		}
//		else{
//			System.out.println("Match failed");
//			this.checkEmail = false;
//			return false;
//		}
//	}

	public void display(){
		System.out.println("===================================");
		System.out.println("Student name:\t" +this.get_name());
		System.out.println("-----------------------------------");
		System.out.println("\tID:\t" +this.id);
		System.out.print("\tEmail\t");
//		if(checkEmail){
//			System.out.println(this.email);
//		}
//		else{
//			System.out.println("Email is invalid");
//		}
		System.out.println(this.email);
		System.out.println("===================================");

	}


}
