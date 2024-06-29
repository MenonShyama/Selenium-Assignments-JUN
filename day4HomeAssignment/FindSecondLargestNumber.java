package week2.day4HomeAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		/*- Declare an array {3, 2, 11, 4, 6, 7}.
		- Pick the 2nd element from the last and print it.
		*/
		int[] arr={3, 2, 11, 4, 6, 7};
		Arrays.sort(arr);
		List<Integer> ls=new ArrayList<Integer>();
		for(int arr1:arr) {
			ls.add(arr1);
		}
		int size=ls.size();
		System.out.println(ls.get(size-2));
	}

}
