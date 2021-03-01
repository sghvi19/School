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
	private final static int CIRCLE_D = 40;
	private final static int CIRCLE_NUM = 50;
	private final static int DELAY = 2000;
	private GOval oval = null;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int click = 0;
	private GObject obj;
	private int counter;
	private GOval ball1;
	private GOval ball2;

	public void run() {
		addMouseListeners();
		for (int i = 0; i < CIRCLE_NUM; i++) {
			int x = rgen.nextInt(0, getWidth() - CIRCLE_D);
			int y = rgen.nextInt(0, getHeight() - CIRCLE_D);
			oval = new GOval(x, y, CIRCLE_D, CIRCLE_D);
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			add(oval);
		}
		counter = CIRCLE_NUM;
		while (true) {
			if (counter == 0)
				break;
			pause(DELAY);
			counter++;
			int x = rgen.nextInt(0, getWidth() - CIRCLE_D);
			int y = rgen.nextInt(0, getHeight() - CIRCLE_D);
			oval = new GOval(x, y, CIRCLE_D, CIRCLE_D);
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			add(oval);
		}
	}

	public void mouseClicked(MouseEvent e) {
		click++;
		if (click % 3 == 0 && getElementAt(e.getX(), e.getY()) != null) {
			if (getElementAt(e.getX(), e.getY()) == ball2) {
				remove(ball2);
			}else {
				click=0;
			}
		}
		if (click % 3 == 1&& getElementAt(e.getX(), e.getY()) != null) {
			ball1 = (GOval) getElementAt(e.getX(), e.getY());
			
		}
		if (click % 3 == 2 && getElementAt(e.getX(), e.getY()) != null) {
			ball2 = (GOval) getElementAt(e.getX(), e.getY());
			if(ball1!=ball2) {
				click=0;
			}
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
