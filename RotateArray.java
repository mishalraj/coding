import java.util.Arrays;

//time complexity O(N) and constant space O(1);
public class RotateArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5};

		rotateArray(arr, arr.length);

		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArray(int[] arr, int n) {

		int temp= arr[n-1];

		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];  		// shifting each element by one from end
		}
		
		arr[0]= temp;

	}

}
