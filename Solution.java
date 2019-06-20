import java.util.Scanner;

/*
 * 
 */
public class Solution {
	
	
	// **** ****
	static int sumValues(int[] ar, int f, int l) throws Exception {
		
		int sum = 0;
		
		// **** perform sanity checks ****
		if ((f < 0) || (f > ar.length)) {
			throw new Exception("f: " + f + " OutOfRange");
		}
		
		if ((l < 0) || (l > ar.length)) {
			throw new Exception("l: " + l + " OutOfRange");
		}
		
		// **** compute the sum ****
		for (int i = f; i <= l; i++)
			sum += ar[i];
		// **** ****
		return sum;
	}
	
	
	// **** ****
	static int prefixSum(int[] ar, int f, int l) throws Exception {
		
		// **** perform sanity checks ****
		if ((f < 0) || (f > ar.length)) {
			throw new Exception("f: " + f + " OutOfRange");
		}
		
		if ((l < 0) || (l > ar.length)) {
			throw new Exception("l: " + l + " OutOfRange");
		}

		// **** compute the prefix array ****
		for (int i = 1; i < ar.length; i++ ) {
			ar[i] += ar[i - 1];
		}
		
		// ???? display the prefix array ????
		System.out.print("prefixSum <<<   ar: [");
		for (int i = 0; i < ar.length; i++) {
			if (i < ar.length - 1)
				System.out.print(ar[i] + ", ");
			else
				System.out.print(ar[i] + "]");
		}
		System.out.println();

		// **** return the proper sum ****
		if (f == 0)
			return ar[l];
		else
			return ar[l] - ar[f - 1];
	}

	
	// **** ****
	public static void main(String[] args) throws Exception {

		// **** used to read input ****
        Scanner sc = new Scanner(System.in);
		
		// **** read the number of elements in the array ****
		int n = sc.nextInt();
		
		// **** read an array or numbers ****
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) 
			ar[i] = sc.nextInt();
		
		// **** read the first element ****
		int f = sc.nextInt();
		
		// **** read the last element ****
		int l = sc.nextInt();
		
		// **** generate and display the sum ****
		System.out.println("main <<<       sum: " + sumValues(ar, f, l));

		// **** generate and display the prefix sum ****
		System.out.println("main <<< prefixSum: " + prefixSum(ar, f, l));
		
        // **** close the scanner ****
        sc.close();
	}

}
