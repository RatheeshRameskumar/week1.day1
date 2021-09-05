package week1.day1.assignment;

public class FibonacciSeries {
		public static void main(String[] args) {
			int range = 8;
			int firstNum = 0, secNum = 1;
			int sum=0;
			System.out.println("The first number is:" + firstNum);
			
			System.out.print("the fibonacci series :" + firstNum + "," + secNum);
			
			for (int i=1; i<= range ; i++) {
				sum = firstNum + secNum;
				firstNum = secNum;
				secNum = sum;
			}
			System.out.println("," + sum );
	}

}
