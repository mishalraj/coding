package arrays;

import java.util.Arrays;

public class ProductOfSelfArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4 };

		int res[]=productArray(arr);
		
		for(int i: res)
		{
			System.out.print(i+" ");
		}

	}
	
	// Time complexity=> O(2n)=> O(n); Linear time complexity
	
	private static int [] productArray(int[] arr) {

		int res[] = new int[arr.length];

		int p = 1;									// because there is nothing to the left of the first element 
		for (int i = 0; i < arr.length; i++) {
			res[i] = p;								
			p *= arr[i];							
		}

		p = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			res[i] *= p;
			p *= arr[i];
		}
		
		return res;
	}

}
