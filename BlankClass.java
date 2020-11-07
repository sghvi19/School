
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
	private int startPointX;
	private int startPointY;
	private int endPointX;
	private int endPointY;
	private boolean first=true;
	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		if (first) {
			startPointX = e.getX();
			startPointY = e.getY();
			first=false;
		}else if(!first) {
			endPointX=e.getX();
			endPointY=e.getY();
		}
		
		
	}

	public void mouseMoved(MouseEvent e) {
		GLine line=new GLine(startPointX,startPointY,e.getX(),e.getY());
		add(line);
	}

}
