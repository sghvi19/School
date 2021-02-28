import java.awt.event.MouseEvent;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class main extends GraphicsProgram {
	private GOval oval;

	public void run() {
		oval = new GOval(getWidth() / 2 - 20, getHeight() / 2 - 20, 40, 40);
		add(oval);
		addMouseListeners();
	}

	public void mouseDragged(MouseEvent e) {
		if (getElementAt(e.getX(), e.getY()) != null) {
			oval.setLocation(e.getX()-20,e.getY()-20);
		}
	}

}
