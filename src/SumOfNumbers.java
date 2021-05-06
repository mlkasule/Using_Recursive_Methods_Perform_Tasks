/**
 * examples of printing the sum of numbers without loops
 * 
 * @author casul
 *
 */
public class SumOfNumbers {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// sum is
		int total = sum(arr, 0, 8);

		System.out.println("Sum is: " + total);
	}

	/**
	 * sum of array
	 * 
	 * @param array
	 * @param start
	 * @param end
	 * @return
	 */
	public static int sum(int[] array, int start, int end) {

		if (start > end) {
			return 0;
		} else {
			return array[start] + sum(array, start + 1, end);
		}
	}

}
