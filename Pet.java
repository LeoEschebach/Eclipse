
public class Pet {
	private String name;
	private int age;
	private String location;
	private String type;
	public Pet() {
		// empty
	}
	public Pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	// get methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getType() {
		return type;
	}
	// set methods
	public void setName(String newName) {
		name = newName;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	public void setLocation(String newLocation) {
		location = newLocation;
	}
	public static void main(String[] args) {
		Pet pet = new Pet("Maggie", 10, "Asheville", "Shih Tzu");
	}

}
