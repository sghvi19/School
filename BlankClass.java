
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
	
	public void run() {
		setup();
		
		while(true) {
			
			if(gOval != null && gOval.getFillColor()!= Color.GREEN) {
				gOval.setColor(getRandomColor());
				pause(DELAY);
			}
		}
	}
	
	private void setup() {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		
		GObject obj = getElementAt(x,y);
		if( obj == null) {
			GOval gOval = new GOval(x - CIRCLE_D / 2, y - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
			gOval.setFilled(true);
			gOval.setColor(rand.nextColor());
			add(gOval);
		}else {
		    gOval = (GOval) obj;
		}
	}
	
	private Color getRandomColor() {
		int index = rand.nextInt(1, 5);
		
		if(index == 1) {
			return Color.GREEN;
		}else if(index == 2) {
			return Color.RED;
		}else if (index ==3) {
			return Color.BLUE;
		}else if(index ==4) {
			return Color.BLACK;
		}else {
			return Color.YELLOW;
		}
	}
}