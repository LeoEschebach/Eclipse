import java.util.*;
public class arrays {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("The sum is: " + sum);
		toPower(4, 2);

	}
	public static void toPower(int size, int power) {
		//The method should return an array of size "size" with each array index raised to the value of "power."
		// So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].
		ArrayList arr = new ArrayList();
		for(int i = 0; i < size; i++) {
			arr.add(Math.pow(i, power)); 
		}
		System.out.println(arr.toString());
	}
}
