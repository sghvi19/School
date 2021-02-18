
import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class solveSudoku extends ConsoleProgram {

	private ArrayList<Integer> list = new ArrayList<Integer>();

	public void run() {
		int[][] matrix = {{ 1, 2, 3},
				{ 4, 0, 6 },
				{ 7, 8, 9 }} ;
			
		solvesudoku(matrix);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == matrix.length-1) {
					print(matrix[i][j]+" ");
					println();
				} else {
					print(matrix[i][j]+" ");
				}
			}
		}

	}

	private void solvesudoku(int[][] sud) {
		while (notFilled(sud)) {
			for (int i = 0; i < sud.length; i++) {
				for (int j = 0; j < sud[0].length; j++) {
					if (sud[i][j] == 0) {
						fillArray();
						writeNumber(sud, i, j);
						list.clear();
					}
				}
			}
		}
	}

	private boolean notFilled(int[][] sud) {
		for (int i = 0; i < sud.length; i++) {
			for (int j = 0; j < sud.length; j++) {
				if (sud[i][j] == 0)
					return true;
			}
		}
		return false;
	}

	private void fillArray() {
		for (int i = 1; i <= 9; i++) {
			list.add(i);
		}
	}

	private void writeNumber(int[][] sud, int i, int j) {
		checkVertical(sud, i, j);
		checkHorizontal(sud, i, j);
		checkSquare(sud, i, j);
		if (list.size() == 1) {
			sud[i][j] = list.get(0);
		}
	}

	private void checkSquare(int[][] sud, int i, int j) {
		i = i - i % 3;
		j = j - j % 3;
		for (int m = i; m < i + 3; m++) {
			for (int n = j; n < j + 3; n++) {
				if (list.contains(sud[m][n])) {
					list.remove(sud[m][n]);
				}
			}
		}
	}

	private void checkHorizontal(int[][] sud, int i, int j) {
		for (int m = 0; m < sud.length; m++) {
			if (list.contains(sud[m][j])) {
				list.remove(sud[m][j]);
			}
		}

	}

	private void checkVertical(int[][] sud, int i, int j) {
		for (int m = 0; m < sud[0].length; m++) {
			if (list.contains(sud[i][m])) {
				list.remove(sud[i][m]);
			}
		}

	}

}
