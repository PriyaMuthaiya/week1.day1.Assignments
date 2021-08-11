package week1.day1.Assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare your input number (int)
		int num=123;
				// Initialize an integer variable by name: sum
			int sum=0;
				// Use loop to calculate the sum: use while loop to set condition until the number goes greater than 0
           while(num>0)
				// Within loop: get the remainder when done by 10 -> Tip: use mod %
           {
        	     int remainder=num%10;
        	     sum=sum+remainder;
        	      num=num/10;
           }
					// Print the remainder to confirm
			System.out.println(sum);
					// Within loop: add that remainder to the sum
			
					// Print the sum to confirm
			
					// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			
					// Print the quotient to confirm
				
				// Outside the loop: print the final sum
	}

}
