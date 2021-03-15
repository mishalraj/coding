import java.util.Scanner;

public class KnightRider {

	private static int findPossibleMoves(char mat[][], int p, int q) {
		int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

		int count = 0;

		for (int i = 0; i < 8; i++) {

			int x = p + X[i];
			int y = q + Y[i];

			if (x >= 0 && y >= 0 && x < mat.length && y < mat[0].length && mat[x][y] == '_' && mat[x][y] != 'x'
					&& mat[x][y] != 'n' && mat[x][y] != '.') {
				mat[x][y] = '.';
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t;
		if (sc.hasNextInt()) {
			t = sc.nextInt();
		} else
			t = 0;
		for (int i = 0; i < t; i++) {
			int r, c;
			if (sc.hasNextInt()) {
				r = sc.nextInt();
			} else
				r = 0;

			if (sc.hasNextInt()) {
				c = sc.nextInt();
			} else
				c = 0;

			char[][] chess = new char[r][c];
			for (int j = 0; j < r; j++) {
				for (int k = 0; k < c; k++) {
					if (sc.hasNext()) {
						chess[j][k] = sc.next().charAt(0);

					}

				}
			}

			int count = 0;
			for (int j = 0; j < r; j++) {
				for (int k = 0; k < c; k++) {
					char ch = chess[j][k];
					if (ch == 'n') {
						count += findPossibleMoves(chess, j, k);
					}
				}
			}

			System.out.println(count);
		}
		sc.close();
	}

}
