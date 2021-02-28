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
		oval = new GOval(getWidth()/2 - 20,getHeight()/2 - 20, 40, 40);
		add(oval);
		addMouseListeners();
		while (true) {
			if (!t) {
				oval.move(0, y);
				pause(10);
				if (oval.getY() <= startY * 0.8 && y<0) {
					startY = startY * 0.8;
					y = -y;
				}
				if (oval.getY() + 40 >= getHeight()) {
					y = -y;
				}
				
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		oval.setLocation(e.getX(),e.getY());
		startY=oval.getY();
		t=false;
		
	}

}
