
public class UnionAndIntersectionOfArray {

	static void UnionArray(int arr1[], int arr2[]) {

		int m = arr1[arr1.length - 1];
		int n = arr2[arr2.length - 1];

		int ans = 0;

		if (m > n) {
			ans = m;
		} else
			ans = n;

		int temp[] = new int[ans + 1];

		System.out.print(arr1[0] + " ");

		++temp[arr1[0]];

		for (int i = 1; i < arr1.length; i++) {

			if (arr1[i] != arr1[i - 1]) {
				System.out.print(arr1[i] + " ");
				++temp[arr1[i]];
			}
		}

		for (int j = 0; j < arr2.length; j++) {

			if (temp[arr2[j]] == 0) {
				System.out.print(arr2[j] + " ");
				++temp[arr2[j]];
			}
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 2, 6, 9 };
		int arr2[] = { 2, 3, 5, 10 };

		UnionArray(arr1, arr2);

	}

}
