
public class PrintStars {

	public static void main(String[] args) {

		System.out.println("This is a recursive method to print triangle");

		// print stars normally
		makeStars(10);

		// controlled single loop
		controlLoop(10);
		System.out.println("");

		// controlled multi loop
		controlMultiLoop(10);

	}

	// normal print of stars
	public static void makeStars(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}

	// this num > 0 will control and prevent infinite loop / repetition
	public static void controlLoop(int num) {
		if (num > 0) {
			System.out.print("*"); // print stars
			controlLoop(num - 1); // call recursive method
		}
	}

	// print controlled multi-loop
	public static void controlMultiLoop(int num) {
		if (num > 0) {
			makeStars(num); // print stars
			controlMultiLoop(num - 1);
		}
	}
}
