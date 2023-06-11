package fibonacci;

/**
 * Using loops, both the recursive and iterative methods for finding the nth number in a Fibonacci sequence are ran until a certain value of the integer i is reached. 
 * The start and end times of each run of the loop are recorded in nanoseconds and used to calculate the total time taken for each run through of the recursive and iterative methods.
 * The nth Fibonacci number and the total runtime are printed to the console.
 * 
 * @author caseyrowlands
 *
 */

public class Fibonacci {
	
	/**
	 * 
	 * @param args Strings to be passed in
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("Iterative version:");
		System.out.println("\n");
		
		for(int i = 5; i < 30; i+=5) {
			long start = System.nanoTime();
			
			int iFib = iterativeFib(i);
			
			long end = System.nanoTime();
			
			double total = (double)(end - start) / 1000;
			
			System.out.println("Fibonacci " + i + " is: " + iFib);
			System.out.println("Total Time: " + total);
			System.out.println("\n");
		}
		
		System.out.println("\n");
		
		System.out.println("Recursive version:");
		System.out.println("\n");
		
		for(int i = 5; i < 30; i+=5) {
			long start = System.nanoTime();
			
			int rFib = recursiveFib(i);
			
			long end = System.nanoTime();
			
			double total = (double)(end - start) / 1000;
			
			System.out.println("Fibonacci " + i + " is: " + rFib);
			System.out.println("Total Time: " + total);
			System.out.println("\n");
		}

	}
	
	/**
	 * Uses an iterative method to calculate the nth number in a Fibonacci sequence
	 * 
	 * @param n The nth number of the sequence that we are looking for.
	 * 
	 * @return returns an integer representing the Fibonacci number 
	 * 
	 */
	public static int iterativeFib(int n) {
		if(n <= 1) {
			return n;
		}
		
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		
		return fib;
	}
	
	/**
	 * Uses a recursive method to calculate the nth number in a Fibonacci sequence
	 * 
	 * @param n The nth number of the sequence that we are looking for.
	 * 
	 * @return returns an integer representing the Fibonacci number 
	 * 
	 */
	public static int recursiveFib(int n) {
		if(n <= 1) {
			return n;
		}
		
		return recursiveFib(n-1) + recursiveFib(n-2);
	}

}
