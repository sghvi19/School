
/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.StringTokenizer;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import acm.util.RandomGenerator;

public class BlankClass extends GraphicsProgram {
	private GRect rect;
	private int number = 0;
	private String num = "0";
	private GLabel label;
	private int mouseX;
	private int mouseY;
	private boolean t=true;
	public void run() {
		addMouseListeners();
		draw();
	}

	private void draw() {
		rect = new GRect(getWidth() / 2 - 100, getHeight() / 2 - 100, 200, 200);
		add(rect);
		label = new GLabel(num);
		add(label, getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
	}

//	public void mouseMoved(MouseEvent e) {
//		mouseX = e.getX();
//		mouseY = e.getY();
//	}

	public void mouseDragged(MouseEvent e) {
		// if (getElementAt(e.getX(), e.getY()) != null) {
		if(t) {
		 mouseX = e.getX();
		 t=false;
		}
		 mouseY = e.getY();
		if (number != 0) {
			if (mouseX > e.getX()) {
				num = "";
				number--;
				num += number;
				remove(label);
				label = new GLabel(num);
				add(label, getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
				t=true;
			}
		} 
		if (number != 9) {
			if (mouseX < e.getX()) {
				num = "";
				number++;
				num += number;
				remove(label);
				label = new GLabel(num);
				add(label, getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
				t=true;
				// }

			}

		}
	}

}

//	private GOval oval;
//	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private static final int CIRCLE_RADIUS = 100;
//
//	private double mouseX;
//	private double mouseY;
//	private double radius;
//
//	private int counter;
//
//	public void init() {
//		oval = null;
//		addMouseListeners();
//		radius = CIRCLE_RADIUS;
//		counter = 0;
//	}
//
//	public void run() {
//		if (oval == null) {
//			oval = new GOval(getWidth() / 2.0 - CIRCLE_RADIUS, getHeight() / 2.0 - CIRCLE_RADIUS, 2 * CIRCLE_RADIUS,
//					2 * CIRCLE_RADIUS);
//			oval.setFilled(true);
//			oval.setFillColor(Color.RED);
//			add(oval);
//		}
//	}
//
//	public void mouseClicked(MouseEvent e) {
//		if (getElementAt(e.getX(), e.getY()) == oval) {
//			oval.setFillColor(getRandomColor());
//		}
//	}
//
//	public void mouseMoved(MouseEvent e) {
//		mouseX = e.getX();
//		mouseY = e.getY();
//	}
//
//	private Color getRandomColor() {
//		return rgen.nextColor();
//	}
//
//	public void mouseDragged(MouseEvent e) {
//		double xCentre = getWidth() / 2.0;
//		double yCentre = getHeight() / 2.0;
//		counter++;
//		
//		if (counter % 2 == 0) {
//			mouseX = e.getX();
//			mouseY = e.getY();
//		}
//
//		double startDistance = getDistance(xCentre, yCentre, mouseX, mouseY);
//		double endDistance = getDistance(xCentre, yCentre, e.getX(), e.getY());
//
//		double diff = endDistance - startDistance;
//
//		double newRadius = radius + diff;
//		radius = newRadius;
//		oval.setBounds(xCentre - newRadius, yCentre - newRadius, 2 * newRadius, 2 * newRadius);
//	}
//
//
//
//	private double getDistance(double x1, double y1, double x2, double y2) {
//		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//	}
//
//}