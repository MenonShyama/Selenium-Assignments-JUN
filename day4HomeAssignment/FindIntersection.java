package week2.day4HomeAssignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// - Declare an array for {3, 2, 11, 4, 6, 7}
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		// - Declare another array for {1, 2, 8, 4, 9, 7}
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		List<Integer> ls1 = new ArrayList<Integer>();
		List<Integer> ls2 = new ArrayList<Integer>();
		for (int arr : arr1) {
			ls1.add(arr);

		}
		// System.out.println(ls1);
		for (int arr : arr2) {
			ls2.add(arr);

		}
		// System.out.println(ls2);
		for (int i = 0; i <= ls1.size() - 1; i++) {
			// System.out.println(ls1.get(0));
			for (int j = 0; j <= ls2.size() - 1; j++) {
				if (ls1.get(i).equals(ls2.get(j))) {
					System.out.println(ls1.get(i));
				}
			}
		}

	}

}
