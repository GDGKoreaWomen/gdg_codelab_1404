public class Fibonacci {
	public static void main(String[] args) {
		int start = Integer.parseInt(args[0]);
		
		//Checking the argument because out of long data at 93
		if (start >= 93) {
			System.out.println("Sorry, the number has to be under 93.");
			return;
		}
		
		//Base number
		long fib1 = 0;
		long fib2 = 1;
		
		//Looping based on argument received
		for (int i = 0; i <= (start - 2); i++) {
			//Fibonacci calculation and print out
			long fib3 = fib1 + fib2;
			System.out.println("F" + i + " = " + fib1 + ", F" + (i + 1) + " = "
					+ fib2 + ", F" + (i + 2) + " =  " + fib3);
			fib1 = fib2;
			fib2 = fib3;
		}
	}
}
