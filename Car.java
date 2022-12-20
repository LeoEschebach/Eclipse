
public class Car {
	private int modelYear;
	private String make;
	private String model;
	
	public Car()	{
		// empty
	}
	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}
	public Car(int modelYear, String make, String model) {
		this.modelYear = modelYear;
		this.make = make;
		this.model = model;
	}
	// get methods
	public int getModelYear() {
		return modelYear;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	// set methods
	public void setModelYear(int newModelYear) {
		modelYear = newModelYear;
	}
	public void setMake(String newMake) {
		make = newMake;
	}
	public void setModel(String newModel) {
		model = newModel;
	}
	public boolean isOld() {
		return true;
	}
	
	public String engineStart() {
		return "VROOM VROOM";
	}
	public static void main(String args[]) {
		Car car = new Car(2013, "Toyota", "Prius");
		System.out.println(car);
	}
	
}
