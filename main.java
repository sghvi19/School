import java.awt.Color;
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

	public void run() {
		GOval oval=new GOval(getWidth()/2,getHeight()/2,30,30);
		oval.setFilled(true);
		oval.setColor(Color.red);
		oval.setFillColor(Color.blue);
		add(oval);
	}

}
