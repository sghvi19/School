import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class main extends GraphicsProgram {
	private RandomGenerator rgen=RandomGenerator.getInstance();
	private static final int RADIUS=20;
	public void run() {
		GOval oval=new GOval(getWidth()/2-RADIUS,getHeight()/2-RADIUS, 2*RADIUS,2*RADIUS);
		oval.setFilled(true);
		add(oval);
		double x=rgen.nextDouble(1,3);
		double y=1;
		while(true) {
			oval.move(x, y);
			pause(10);
		}
	}

}
