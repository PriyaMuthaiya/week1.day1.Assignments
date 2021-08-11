package week1.day1.Assignment;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 1)Assinging numbers 2)for loop
	 */

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		
		int range=8;
		int firstNum=0;
		int secNum=1;
		int sum=0;
		
		// Print first number
		System.out.println("First Number is"+firstNum);
		// Iterate from 1 to the range
		for (int i = 0; i <range; i++) {
			
		
		// add first and second number assign to sum
		sum=firstNum+secNum;

		// Assign second number to the first number
         firstNum=secNum;
		// Assign sum to the second number
		secNum=sum;
		// print sum
		}
		System.out.println("sum of fibonaci serie"+sum);

	}

}

