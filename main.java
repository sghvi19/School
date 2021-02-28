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
	private boolean t=true;

	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		if(t) {
		oval = new GOval(e.getX()- 20, e.getY() - 20, 40, 40);
		add(oval);
		}else {
			oval.setLocation(e.getX()- 20, e.getY() - 20);
		}
	}

}
