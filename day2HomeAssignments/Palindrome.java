package week1.day2HomeAssignments;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * Requirements: - To reverse a number and check for palindrome, Declare two
		 * variables of int data type such as - ‘input’ to assign the given number -
		 * ‘output’ to store the reversed form of the input number - Use for loop to
		 * reverse the digits of 'input'. - Finally, compare ‘input’ with ‘output’ to
		 * print whether the given input is a palindrome or not.
		 */
		int input = 12321;
		
		int output = 0;
		int remainder = 0;
		// while(input!=0) {
		for (int i = input; i >= 0;) {
			//System.out.println(i);
			remainder = i % 10;
			output = (output * 10) + remainder;
			i = i / 10;
			if (i == 0) {
				break;
			}

		}
		if (input == output) {
			System.out.println("The given number is Palindrome");
		} else {
			System.out.println("The given number is not a Palindrome");
		}

	}

}
