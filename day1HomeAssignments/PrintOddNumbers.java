package week1.day1HomeAssignments;

public class PrintOddNumbers {

	public static void main(String[] args) {
		/*
		 * Assignment Details: 
		 * Create a class named FindOddNumbers with integer variable as maxRange with value 10 -Write a logic to print the odd numbers from 1 to 10.
		 * Requirements: Create a java class named FindOddNumbers - Declare a with
		 * integer variable as maxRange with value 10 - Use for loop to iterate - Divide
		 * the value and check the reminder is equal to 1 using if condition
		 */
		int maxRange = 10;
		System.out.println("Odd Numbers:");
		for (int i = 0; i <= maxRange; i++) {

			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
