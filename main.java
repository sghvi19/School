import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class main extends ConsoleProgram {
	public void run() {
		int[][] matrix = new int[4][8];

		int[] arr = { 0, 1, 1, 0, 0, 1, 0, 0 };
		int[] arr1 = { 0, 1, 1, 1, 1, 1, 0, 0 };
		int[] arr2 = { 0, 0, 1, 1, 1, 1, 0, 0 };
		int[] arr3 = { 0, 0, 1, 1, 1, 1, 0, 0 };

		matrix[0] = arr;
		matrix[1] = arr1;
		matrix[2] = arr2;
		matrix[3] = arr3;

		println(maxRectangleArea(matrix));
	}

	// Problem: 59
	private int maxRectangleArea(int[][] matrix) {
		int maxArea = 0;

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == 1) {
					int area = maxSubRectangleArea(matrix, i, j);
					if (area > maxArea) {
						maxArea = area;
					}
				}
			}

		}
		return maxArea;
	}

	private int maxSubRectangleArea(int[][] matrix, int iStart, int jStart) {
		int maxArea = 0;

		for (int iEnd = iStart; iEnd < matrix.length; iEnd++) {

			for (int jEnd = jStart; jEnd < matrix[0].length; jEnd++) {

				int currentArea = rectangeArea(matrix, iStart, jStart, iEnd, jEnd);

				if (currentArea != -1) {
					if (maxArea < currentArea) {
						maxArea = currentArea;
					}
				}
			}
		}
		return maxArea;
	}

	private int rectangeArea(int[][] matrix, int iStart, int jStart, int iEnd, int jEnd) {
		int area = 0;

		if (Math.abs(iStart - iEnd) == Math.abs(jStart - jEnd)) {
			for (int i = iStart; i <= iEnd; i++) {
				for (int j = jStart; j <= jEnd; j++) {

					if(j-i==jStart-iStart && matrix[i][j]==1) {
					area++;
					}else {
						return -1;
					}
					if(iEnd+jEnd==i+j){
						area++;
					}else {
						return -1;
					}
				}
			}
			area--;
			return area;
		}else {
			return -1;
		}
		
	}

}

//public class main extends GraphicsProgram {
//	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private boolean t1 = true;
//	private boolean t2 = true;
//	private GOval currentOval;
//	private GOval previous = null;
//
//	public void run() {
//		GOval oval;
//		for (int i = 0; i < 25; i++) {
//			Color color = rgen.nextColor();
//			for (int j = 0; j < 2; j++) {
//				int x = rgen.nextInt(0, getWidth() - 40);
//				int y = rgen.nextInt(0, getHeight() - 40);
//				oval = new GOval(x, y, 40, 40);
//				oval.setFilled(true);
//				oval.setColor(color);
//				add(oval);
//			}
//		}
//		addMouseListeners();
//
//		while (true) {
//			pause(2000);
//			Color color = rgen.nextColor();
//			for (int i = 0; i < 2; i++) {
//				int x = rgen.nextInt(0, getWidth() - 40);
//				int y = rgen.nextInt(0, getHeight() - 40);
//				oval = new GOval(x, y, 40, 40);
//				oval.setFilled(true);
//				oval.setColor(color);
//				add(oval);
//			}
//		}
//	}
//
//	public void mouseClicked(MouseEvent e) {
//		if (t1) {
//			currentOval = (GOval) getElementAt(e.getX(), e.getY());
//			t1 = false;
//			if (currentOval != null && previous != null && currentOval != previous) {
//				if (previous != null && currentOval.getColor() == previous.getColor()) {
//					remove(currentOval);
//					remove(previous);
//					t1 = true;
//				}
//			}
//		} else {
//			previous = currentOval;
//			currentOval = (GOval) getElementAt(e.getX(), e.getY());
//			if (currentOval != null && previous != null && currentOval != previous) {
//				if (previous.getColor() == currentOval.getColor()) {
//					remove(previous);
//					remove(currentOval);
//					t1 = true;
//				}
//			} else {
//				previous = currentOval;
//			}
//
//		}
//
//	}
//
//}
