import java.awt.event.MouseEvent;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class main extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int RADIUS = 20;

	public void run() {

		addMouseListeners();

	}

	public void mouseMoved(MouseEvent e) {
		GOval oval = new GOval(e.getX()-RADIUS, e.getY() - RADIUS, 2 * RADIUS, 2 * RADIUS);
		add(oval);
	}

}
