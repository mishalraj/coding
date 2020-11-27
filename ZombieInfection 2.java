package arrays;


import java.util.*;

class ZombieInfection {

	static int orangesRotting(int[][] oranges) {
		Set<String> fresh = new HashSet<>();
		Set<String> rotten = new HashSet<>();

		for (int i = 0; i < oranges.length; i++) {
			for (int j = 0; j < oranges[0].length; j++) {
				if (oranges[i][j] == 1) {
					rotten.add("" + i + j);
				} else {
					fresh.add("" + i + j);
				}
			}
		}

			int time = 0;

			int[][] directions = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 }};

			while (fresh.size() != 0) {
				Set<String> infected = new HashSet<>();
				for (String s : rotten) {
					int i = s.charAt(0) - '0';
					int j = s.charAt(1) - '0';

					for (int[] direction : directions) {
						int iNew = i + direction[0];
						int jNew = j + direction[1];
						if (fresh.contains("" + iNew + jNew)) {
							infected.add("" + iNew + jNew);
							fresh.remove("" + iNew + jNew);
						}
					}
				}
				if (infected.size() == 0)
					return -1;

				rotten = infected;
				time++;
			}

			
			return time;

		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println("Enter the matrix");

		int oranges[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				oranges[i][j] = sc.nextInt();
			}
		}

		System.out.println("The matrix ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(oranges[i][j]);
			}

			System.out.println();
		}

		System.out.println(orangesRotting(oranges));
	}
}