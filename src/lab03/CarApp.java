package lab03;

public class CarApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setMake("Toyota");
		car1.setModel("Yaris");
		car1.setYear(1998);
		car1.setMiles(23500200);
		
		Car car2 = new Car("BMW", "3 Series", 2010, 31000);
		
		car1.disp();
		car2.disp();

	}

}
