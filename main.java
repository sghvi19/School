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
	private boolean t = true;
	private double startY;
	public void run() {
		int y = 3;

		addMouseListeners();
		while (true) {
			if (!t) {
				oval.move(0, y);
				pause(10);
				if (oval.getY() + 40 >= getHeight()) {
					y = -y;
				}
				if (oval.getY() <= startY * 0.8) {
					startY = startY * 0.8;
					y = -y;
				}
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		if (t) {
			oval = new GOval(e.getX() - 20, e.getY() - 20, 40, 40);
			add(oval);
			t = false;
		startY = oval.getY();
		} else {
			oval.setLocation(e.getX() - 20, e.getY() - 20);
		}
	}

}
