package arrays;


import java.util.Scanner;

public class NumOfIsland {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of matrix : rows");
			int rows = sc.nextInt();
			System.out.println("Enter the size of matrix : columns");
			int cols = sc.nextInt();
			int arr[][] = new int[rows][cols];
			System.out.println("Enter the matrix");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println("Matrix:");
			System.out.println();
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					System.out.print(" " + arr[i][j]);
				}
				System.out.println();
			}
			int count = 0;
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (arr[i][j] == 1) {
						count++;
						countIslands(arr, i, j);
					}
				}
			}
			System.out.println();
			System.out.println("Number of islands: " + count);
		}
	}

	private static void countIslands(int[][] arr, int i, int j) {
		if (i < 0 || j < 0 || i >= arr.length || j >= arr[i].length || arr[i][j] == 0) {
			return;
		}
		arr[i][j] = 0;
		countIslands(arr, i + 1, j);
		countIslands(arr, i - 1, j);
		countIslands(arr, i, j + 1);
		countIslands(arr, i, j - 1);
		countIslands(arr, i - 1, j - 1);
		countIslands(arr, i + 1, j + 1);
		countIslands(arr, i + 1, j - 1);
		countIslands(arr, i - 1, j + 1);
	}

}


