import java.util.ArrayList;

import acm.program.ConsoleProgram;
import acmx.export.java.util.Arrays;

public class solveSudoku extends ConsoleProgram {

	private ArrayList<Integer> list = new ArrayList<Integer>();

	public void run() {
		int[][] matrix = { { 0, 0, 0, 0, 0, 8, 3, 5, 4 }, { 7, 0, 0, 6, 0, 2, 8, 1, 0 }, { 0, 0, 0, 9, 0, 0, 7, 0, 2 },
				{ 0, 5, 8, 7, 0, 4, 0, 0, 0 }, { 4, 3, 2, 5, 1, 0, 6, 7, 8 }, { 0, 1, 0, 0, 0, 6, 0, 0, 5 },
				{ 8, 6, 0, 0, 3, 0, 0, 0, 0 }, { 3, 0, 0, 0, 9, 5, 1, 2, 0 }, { 0, 0, 9, 0, 0, 7, 0, 8, 0 } };

		solveSudoku(matrix);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == 8) {
					print(" " + matrix[i][j]);
					println();
				} else {
					print(" " + matrix[i][j]);
				}
			}
		}

	}

	private void solveSudoku(int[][] sud) {
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
				if (list.contains(sud[i][j])) {
					list.remove(sud[i][j]);
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
		for (int m = 0; m < sud.length; m++) {
			if (list.contains(sud[i][m])) {
				list.remove(sud[i][m]);
			}
		}

	}

}
