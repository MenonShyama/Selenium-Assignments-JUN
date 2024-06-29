package week2.day4HomeAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
	
		int[] arr = { 1, 2, 3, 4, 10, 6, 8 };
		Arrays.sort(arr);
		List<Integer> ls1 = new ArrayList<Integer>();
		List<Integer> ls2 = new ArrayList<Integer>();
		for (int arr1 : arr) {
			ls1.add(arr1);

		}
		int lastValue = ls1.get(ls1.size() - 1);
		System.out.println(ls1.get(ls1.size() - 1));
		ls2.add(ls1.get(0));
		for (int i = ls1.get(0); i <= lastValue - 1; i++) {
			ls2.add(i + 1);
			if (i == lastValue) {
				break;
			}

		}
		ls2.removeAll(ls1);
		System.out.println(ls2);

	}

}
