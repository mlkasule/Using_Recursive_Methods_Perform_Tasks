
import java.util.Scanner;

public class SumOfInputByUser {

	int MAX_ELEMENTS = 5;
	int[] list = new int[MAX_ELEMENTS]; // will hold data entered

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter numbers to be totalled: " + "\n(Press Ctrl Z for total) ");

		double total = inputSum(input); // call inputSum method and store in total

		System.out.println("Total is: " + total); // print

	}

	/**
	 * method will return 0 if there is no next element
	 * 
	 * @param inputData
	 * @return
	 */
	public static double inputSum(Scanner inputData) {

		double total = 0;

		// if input does have other elements
		if (!inputData.hasNext()) {
			total = 0; // add first elem to next elem when called
		} else {

			total = inputData.nextInt() + inputSum(inputData);
		}
		return total;
	}

}
