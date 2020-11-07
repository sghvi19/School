/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import java.awt.event.MouseEvent;

import acm.program.*;

public class BlankClass extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Click!");
	}	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Dragged");
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Moved");
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed");
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered");
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited");
	}
}

