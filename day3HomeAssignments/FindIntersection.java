package week1.day3HomeAssignments;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Requirements: - Declare An array for {3,2,11,4,6,7}; - 
		 * Declare another array
		 * for {1,2,8,4,9,7}; -
		 * Declare for loop iterator from 0 to array length -
		 * Declare a nested for another array from 0 to array length - 
		 * Compare both the
		 * arrays using a conditional statement. - 
		 * Print the value from first array when
		 * there is a match
		 */
		
		int[] arr1={3,2,11,4,6,7};
		int[] arr2={1,2,8,4,9,7};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
				
			}
		}

	}

}
