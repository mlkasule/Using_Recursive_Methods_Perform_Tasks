/**
 * The maximum-valued element of an integer-valued array can be recursively
 * calculated as follows:
 * 
 * If the array has a single element, that is its maximum (note that a
 * zero-sized array has no maximum) Otherwise, compare the first element with
 * the maximum of the rest of the array—whichever is larger is the maximum
 * value.
 * 
 * Write an int method named max that accepts an integer array, and the number
 * of elements in the array and returns the largest value in the array.
 * 
 * Assume the array has at least one element.
 * 
 * @author Mark Kasule
 *
 */
public class GetMaxValueInArray {

	public static void main(String[] args) {

		int[] list = { 2, 4, 6, 3, 8, 7, 9 };

		int maxNumber = getMax(list, list.length);

		System.out.println("Maximum number is: " + maxNumber);

	}

	public static int getMax(int[] array, int numOfElements) {

		if (numOfElements == 1)// will call the first element only
			return array[0];
		else {
			// recursive method will reduce size of array and call element at 0
			int secondElement = getMax(array, numOfElements - 1);

			if (secondElement > array[numOfElements - 1]) {
				// return recursive method that will call third element
				return getMax(array, numOfElements - 1);

			} else
				return array[numOfElements - 1];
		}

	}
}
