
/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.*;

public class BlankClass extends GraphicsProgram {
	private GLine line;
	private boolean t = true;

	public void init() {
		addMouseListeners();
	}

	public void run() {
		GLine line1=new GLine(10,10,50,50);
		add(line1);
		//line1.setEndPoint(100, 100);
	}

//	public void mouseClicked(MouseEvent e) {
//		if (t) {
//			line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
//			add(line);
//			t = false;
//		} else {
//			t = true;
//		}
//	}
//
//	public void mouseMoved(MouseEvent e) {
//		if (line != null && !t) {
//			line.setEndPoint(e.getX(), e.getY());
//		}
//	}
}
