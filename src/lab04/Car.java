package lab04;

public class Car {

	// vars
	private int year;
	private long miles;
	private String make, model;
	private double petrolLevel;
	
	// constructors
	public Car(){
		year = 2000;
		miles = 0;
		make = "No manufacturer";
		model = "No model";
		setPetrolLevel(0);
	}
	public Car(String make, String model, int year, long miles, double petrolLevel){
		this.make = make;
		this.model = model;
		this.year = year;
		this.miles = miles;
		this.setPetrolLevel(petrolLevel);
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
	public double getPetrolLevel() {
		return petrolLevel;
	}
	public void setPetrolLevel(double petrolLevel) {
		this.petrolLevel = petrolLevel;
	}
	
	// functional methods
	public void Drive(int distance){
		double petrolNeeded = distance * 1.5;
		if (petrolNeeded >= getPetrolLevel()){
			setPetrolLevel(getPetrolLevel() - petrolNeeded);
			setMiles(getMiles() + distance);
		} else {
			System.out.println("!! Not enough petrol to drive that far");
		}
	}
	public void disp(){
		System.out.println("========================================");
		System.out.println(" Make:    " + getMake());
		System.out.println(" Model:   " + getModel());
		System.out.println(" Year:    " + getYear());
		System.out.println(" Miles    " + getMiles());
		System.out.println(" Petrol:  " + getPetrolLevel());
	}
}
