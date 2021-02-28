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
	private int mouseX;
	private int mouseY;
	private GLine line;

	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		line = new GLine(mouseX, mouseY, mouseX, mouseY);
		add(line);
	}

	public void mouseMoved(MouseEvent e) {
		remove(line);
		line = new GLine(mouseX, mouseY, e.getX(),e.getY());
		add(line);
	}

}
