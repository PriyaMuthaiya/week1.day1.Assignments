package week1.day1.Assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare your input

		     int input=120;

		

					// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)

				
				int calculated=0;
				int remainder;
				int original=0;
				

					// Assign input into variable original 

				      input=original;
				     

				

					// Use loop to calculate: use while loop to set condition until the number greater than 0

				while(original>0) {
				 remainder= original%10;
				
				 calculated=calculated+remainder*remainder*remainder;
				  input=original/10;
				 
				}
				if(calculated==original)
				{
					System.out.println("Amstrong");
				}
					// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

				else
				{
					System.out.println("Not amstrong");
				}

					// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)

					

					// Within loop: Add calculated with the cube of remainder & assign it to calculated

					
						

					// Check whether calculated and original are same

				

					//When it matches print it as Armstrong number


				



				

	}

}
