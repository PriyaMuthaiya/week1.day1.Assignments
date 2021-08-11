package week1.day1.Assignment;

public class PrimeNumber {

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13

		int input = 12;

		// Declare a boolean variable flag as false
		boolean flag = false;

		// Iterate from 2 to half of the input

		for (int i = 2; i <= input / 2; i++) {

			// Divide the input with each for loop variable and check the remainder

			int remainder = input % i;

			// Set the flag as true when there is no remainder

			if (remainder == 0) {
				flag = true;
				break;
			}
			// break the iterator

		}

		// Check the flag (Provide a condition)
		if (flag == false) {
			System.out.println("Given number is  prime");
		}

		// Print 'Prime' when the condition matches

		else {
			System.out.println("Given number is not prime");
		}

		// Print 'Not a Prime' when the condition doesn't match

	}
}
