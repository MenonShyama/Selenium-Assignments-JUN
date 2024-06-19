package week1.day3HomeAssignments;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		/*
		 * Find the missing element in the given array Input -> {1, 4,3,2,8, 6, 7};
		 * Output -> 5
		 */
		int[] arr = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				System.out.println(arr[i] - 1);
				break;

			}
		}

	}

}
