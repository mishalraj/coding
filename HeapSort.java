package graph;

public class HeapSort {

	private void sort(int arr[]) {
		int n = arr.length;

		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		for (int i = n - 1; i > 0; i--) {
			swap(arr, i, 0);
			heapify(arr, i, 0);
		}
	}

	private void heapify(int arr[], int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && arr[largest] < arr[left]) {
			largest = left;
		}
		if (right < n && arr[largest] < arr[right]) {
			largest = right;
		}

		if (largest != i) {
			swap(arr, i, largest);

			heapify(arr, n, largest);
		}

	}

	private void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		HeapSort obj = new HeapSort();

		obj.sort(arr);

		printArr(arr);

	}

}
