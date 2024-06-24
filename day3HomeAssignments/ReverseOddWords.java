package week1.day3HomeAssignments;

public class ReverseOddWords {
	public static void main(String[] args) {
		/*- Split the words and have it in an array
		- Traverse through each word using loop
		- Find the odd index within the loop
		- Convert the String array into a character array
		- Print the even position words using another loop*/
		String test = "I am a software tester";
		String[] arr = test.split(" ");
		String rev = "";
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 2 == 1) {
				rev = rev + " ";

				char[] charArray = arr[i].toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					rev = rev + "" + charArray[j];
				}
			} else {
				rev = rev + " " + arr[i];

			}
		}
		System.out.println(rev);

	}

}
