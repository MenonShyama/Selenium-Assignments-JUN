package week1.day3HomeAssignments;

import java.util.Arrays;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		/*- Convert the given String to a character array.
		- Implement a loop to iterate through each character of the String (from end to start).
		- Find the odd index within the loop
		- Inside the loop, change the character to uppercase only if the index is odd
		- Print the characters with the expected output: cHaNgEmE*/
		String str = "changeme";
		str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i % 2 == 1) {

				ch = Character.toUpperCase(ch);

			} else {
				ch = str.charAt(i);

			}

			System.out.println(ch);
		}

	}

}
