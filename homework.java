import java.util.*;
public class homework {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		ArrayList nums = new ArrayList();
		int sum = 0;
		int product = 1;
		int largest = 0; 
		int smallest = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Please enter a number: ");
			int num = key.nextInt();
			nums.add(num);
			sum += num;
			product = product * num;
			if(num > largest) {
				largest = num;
			}
			if(num < smallest) {
				smallest = num;
			}
			
		}
		System.out.println("Sum: " + sum + "\n Product: " + product + "\n Largest: " + largest + "\n Smallest: " + smallest);
		
		HashMap<String, String> vehicle = new HashMap<>();
		
		vehicle.put("Honda", "Civic");
		vehicle.put("Toyota", "Prius");
		vehicle.put("Nissan", "Altima");
		vehicle.put("Ford", "Bronco");
		Scanner input = new Scanner(System.in);
		System.out.println("What model are you looking for?");
		String modelChoice = input.nextLine();
		if(vehicle.containsKey(modelChoice)) {
			System.out.println("We have a " + modelChoice + " " + vehicle.get(modelChoice) + " for sale.");
		}
		else {
			System.out.println("Sorry, we don't have that model in stock.");
		}
	}
}
