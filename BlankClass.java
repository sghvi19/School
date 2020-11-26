
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
	private static final double CIRCLE_D = 4;
	private RandomGenerator rand = RandomGenerator.getInstance();
	private GOval oval;
	private static final int DELAY = 100;

	private boolean f = false;

	public void run() {
		setup();
		addMouseListeners();

	}

	private void setup() {
		oval = new GOval(getWidth() / 2 - CIRCLE_D / 2, getHeight() / 2 - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
		oval.setFilled(true);
		oval.setFillColor(Color.BLACK);
		add(oval);
	}

	public void mouseDragged(MouseEvent e) {
		int x=e.getX();
		int y= x-e.getX();
		
		oval.setSize(x+CIRCLE_D,y+CIRCLE_D);
		}
}