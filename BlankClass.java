
/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.*;

public class BlankClass extends GraphicsProgram {
	private GLine line;
	private boolean t = true;
	private GOval oval;

	public void run() {
		addMouseListeners();
		oval = new GOval(20, 20, 20, 20);
		add(oval);
	}

	public void mouseDragged(MouseEvent e) {
		oval.setLocation(e.getX()+10, e.getY()+10);
	}

}
