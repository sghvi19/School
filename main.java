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

public class main extends GraphicsProgram {
	private GOval oval;
	private double x=0;
	private double y=0;
	private boolean t=false;
	public void run() {
		oval = new GOval(getWidth() / 2 - 20, getHeight() / 2 - 20, 40, 40);
		add(oval);
		while (true) {
			if(t) {
			double R= Math.sqrt((Math.pow(getWidth()/2-x,2))-Math.pow((getHeight()/2-y),2));
			oval.setBounds(getWidth()/2-R,getHeight()/2-R,2*R,2*R);
			}
		}
	}
	
	
	public void mouseDragged(MouseEvent e) {
		t=true;
		x=e.getX();
		y=e.getY();
		
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
