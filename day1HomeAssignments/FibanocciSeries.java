package week1.day1HomeAssignments;

import java.util.Iterator;

public class FibanocciSeries {

	public static void main(String[] args) {
		/*
		 * Assignment Details: To find Fibonacci Series for a given range input(range):
		 * 8 Requirements: User input for the desired range of the Fibonacci series.
		 * Displaying the generated Fibonacci series as the program output – 0, 1, 1,
		 * 2,3, 5, 8, and 13.
		 */

		int num1 = 0;
		int num2 = 1;
		int range = 8;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 1; i <= range; i++) {
			int sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		}

	}

}
