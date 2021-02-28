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
	private static final int RECT_WIDTH = 80;
	private static final int RECT_HEIGHT = 100;
	private static final int MIN_H = 10;
	private RandomGenerator rg;
	private GOval oval;
	private GPoint p;
	private boolean isPressed = false;
	

	public void run() {
		rg = RandomGenerator.getInstance();
		oval = new GOval(getWidth() / 2 - RECT_WIDTH / 2,
							getHeight() / 2 - RECT_HEIGHT / 2, 
						RECT_WIDTH, RECT_HEIGHT);
		oval.setFilled(true);
		add(oval);
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		GObject o = getElementAt(e.getX(), e.getY());
		if(o != null) {
			oval.setColor(rg.nextColor());
		}
	}
	public void mousePressed(MouseEvent e) {
		p = new GPoint(e.getX(), e.getY());
	}
	
	
	public void mouseDragged(MouseEvent e) {
		double diffX = e.getX() - p.getX();
		double diffY = e.getY()- p.getY();
		oval.setSize(oval.getWidth() + 2*diffX, oval.getHeight() + 2*diffY);
		oval.setLocation(oval.getX() - diffX, oval.getY() - diffY);
		p.setLocation(e.getX(), e.getY());
	}
}
