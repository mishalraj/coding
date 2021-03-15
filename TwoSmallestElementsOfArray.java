
import java.util.*;

public class TwoSmallestElementsOfArray {

	public static void findNum(int arr[], int n) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] < first) {
				second = first;
				first = arr[i];
			}
			else if (arr[i] < second && arr[i] != first) {
				second = arr[i];
			}
		}
		if (second == Integer.MAX_VALUE) {
			System.out.println("No second smallest value");
		}
		else {
			System.out.println("first--->" + first + "  " + "Second--->" + second);
		}
	}
	
	public static void findTwoLargest(int arr[], int n) {
		int first = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] > first) {
				sec = first;
				first = arr[i];
			}
			else if (arr[i] > sec && arr[i] != first) {
				sec = arr[i];
			}
		}
		if (sec == Integer.MIN_VALUE) {
			System.out.println("No second largest value");
		}
		else {
			System.out.println("first--->" + first + "  " + "Second--->" + sec);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		if (n < 2) {
			System.out.println("Invalid size");
		}
		System.out.println("Enter the array");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		findNum(arr, n);
		findTwoLargest(arr, n);
	}

}
