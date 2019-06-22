import java.util.Scanner;

/*
 * 
 */
public class Solution {
	
	
	// **** ****
	static int sumValues(int[] A, int i, int j) throws Exception {
		
		int sum = 0;
		
		// **** perform sanity checks ****
		if ((i < 0) || (i > A.length)) {
			throw new Exception("i: " + i + " OutOfRange");
		}
		
		if ((j < 0) || (j > A.length)) {
			throw new Exception("j: " + j + " OutOfRange");
		}
		
		// **** compute the sum ****
		for (int k = i; k <= j; k++)
			sum += A[k];
		
		// **** ****
		return sum;
	}
	
	
	// **** ****
	static int prefixSum(int[] A, int i, int j) throws Exception {
		
		// **** perform sanity checks ****
		if ((i < 0) || (i > A.length)) {
			throw new Exception("i: " + i + " OutOfRange");
		}
		
		if ((j < 0) || (j > A.length)) {
			throw new Exception("j: " + j + " OutOfRange");
		}

		// **** compute the prefix array ****
		for (int k = 1; k < A.length; k++ ) {
			A[k] += A[k - 1];
		}
		
		// ???? display the prefix sum array ????
		System.out.print("prefixSum <<<    A: [");
		for (int k = 0; k < A.length; k++) {
			if (k < A.length - 1)
				System.out.print(A[k] + ", ");
			else
				System.out.print(A[k] + "]");
		}
		System.out.println();
		
		// **** return the sum ****
		if (i == 0)
			return A[j];
		else
			return A[j] - A[i - 1];
	}

	
	// **** ****
	public static void main(String[] args) throws Exception {

		// **** used to read input ****
        Scanner sc = new Scanner(System.in);
		
		// **** read the number of elements in the array ****
		int n = sc.nextInt();
		
		// **** read an array or numbers ****
		int[] A = new int[n];
		for (int k = 0; k < n; k++) 
			A[k] = sc.nextInt();
		
		// **** read the first element ****
		int i = sc.nextInt();
		
		// **** read the last element ****
		int j = sc.nextInt();
		
		// **** generate and display the sum ****
		System.out.println("main <<<       sum: " + sumValues(A, i, j));

		// **** generate and display the prefix sum ****
		System.out.println("main <<< prefixSum: " + prefixSum(A, i, j));
		
        // **** close the scanner ****
        sc.close();
	}

}
