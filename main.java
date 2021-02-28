import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class main extends GraphicsProgram {
	private RandomGenerator rgen=RandomGenerator.getInstance();
	
	public void run() {
		GOval oval;
		for (int i = 0; i < 2; i++) {
			Color color=rgen.nextColor();
			for (int j = 0; j < 2; j++) {
				int x=rgen.nextInt(0,getWidth()-40);
				int y=rgen.nextInt(0,getHeight()-40);
				oval=new GOval(x,y,40,40);
				oval.setFilled(true);
				oval.setColor(color);
				add(oval);
			}
		}
	}

}
