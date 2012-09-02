package lab03;

public class Car {

	// vars
	private int year;
	private long miles;
	private String make, model;
	
	// constructors
	public Car(){
		year = 2000;
		miles = 0;
		make = "No manufacturer";
		model = "No model";
	}
	public Car(String make, String model, int year, long miles){
		this.make = make;
		this.model = model;
		this.year = year;
		this.miles = miles;
	}
	
	// gets & sets
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}
	public void setMiles(long miles){
		this.miles = miles;
	}
	public long getMiles(){
		return miles;
	}
	public void setMake(String make){
		this.make = make;
	}
	public String getMake(){
		return make;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}
	
	// functional methods
	public void disp(){
		System.out.println("========================================");
		System.out.println(" Make:    " + getMake());
		System.out.println(" Model:   " + getModel());
		System.out.println(" Year:    " + getYear());
		System.out.println(" Miles    " + getMiles());
	}
}
