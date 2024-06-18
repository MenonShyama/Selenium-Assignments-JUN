package week1.day1HomeAssignments;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		/*- Create a class by name: IsPrime
		- Create a main method using shortcut
		- Write a logic to find if the given number is prime or not
		- Print if it is prime or not
		*/

		int input = 47;
		int flag = 0;
		if (input == 0 || input == 1) {
			System.out.println("The given input " + input + " is prime");
		}
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				flag = 1;
			}

		}
		if (flag > 0) {
			System.out.println("The given input " + input + " is not prime");
		} else {
			System.out.println("The given input " + input + " is prime");
		}

	}

}
