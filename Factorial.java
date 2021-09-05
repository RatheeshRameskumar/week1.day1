package week1.day1.assignment;

public class Factorial {

	public static void main(String[] args) {
		int input = 5;

		int fact = 1;

		for (int i = 1; i <= input; i++) {
			fact = fact * i;
		}

		// Print factorial (fact)
		System.out.println(fact);
	}
}