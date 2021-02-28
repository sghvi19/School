import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class main extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GOval oval;
	private boolean t = false;
	private GOval ovals;
	public void run() {
		addMouseListeners();
		while (true) {
			if (t && ovals.getColor() != Color.green) {
				Color color=getRandomColor();
				ovals.setColor(color);
			}

		}
	}

	public void mouseClicked(MouseEvent e) {
		if (getElementAt(e.getX(), e.getY()) == null) {
			oval = new GOval(e.getX() - 20, e.getY() - 20, 40, 40);
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			add(oval);
		} else {
			 ovals = (GOval) getElementAt(e.getX(), e.getY());

		}

	}

	private Color getRandomColor() {
		int x = rgen.nextInt(0, 4);
		if (x == 0) {
			return Color.BLUE;
		}
		if (x == 1) {
			return Color.RED;
		}
		if (x == 2) {
			return Color.CYAN;
		}
		if (x == 3) {
			return Color.GRAY;
		} else {
			return Color.green;
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
