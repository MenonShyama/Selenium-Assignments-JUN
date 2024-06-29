package week2.day4HomeAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] arr = { "HCL", "Wipro", "Aspire", "Systems", "CTS" };
		Arrays.sort(arr);
		List<String> list = new ArrayList<String>();
		for (String ls : arr)

			list.add(ls);
		System.out.println(list);
		List<String> revlist = new ArrayList<String>();
		for (int i = list.size() - 1; i >= 0; i--) {
			revlist.add(list.get(i));

		}
		System.out.println(revlist);
	}

}
