
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

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class BlankClass extends GraphicsProgram {
	private static final double CIRCLE_D = 60;
	private RandomGenerator rand = RandomGenerator.getInstance();
	private GOval gOval = null;
	private static final int DELAY = 100;

	private boolean f = false;

	public void run() {
		addMouseListeners();

		while (true) {
			if (f && gOval.getFillColor() != Color.GREEN) {
				Color col = rand.nextColor();
				gOval.setFilled(col == Color.GREEN || col == Color.black || col == Color.RED || col == Color.CYAN);
				gOval.setFillColor(col);
				
				f = false;
			}
		}

	}

	public void mouseClicked(MouseEvent e) {
		if (getElementAt(e.getX(), e.getY()) == null && !f) {
			GOval oval = new GOval(e.getX() - CIRCLE_D / 2, e.getY() - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
			add(oval);
		} else {
			f = true;
			gOval = (GOval) getElementAt(e.getX(), e.getY());
		}
	}
}