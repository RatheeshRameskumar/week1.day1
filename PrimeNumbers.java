package week1.day1.assignment;

public class PrimeNumbers {

	public static void main(String[] args) {
		int input = 15;

		boolean flag = false;
		int remainder;

		for (int i = 2; i <= input; i++) {

			remainder = input % i;

			if (remainder == 0) {
				flag = true;
				System.out.println(i + " is a prime number");
			}

		}

	}
}