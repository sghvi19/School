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

	public void run() {
		GPolygon diamond = createDiamond(100, 75);
		diamond.setFilled(true);
		diamond.setFillColor(Color.RED);
		add(diamond, getWidth() / 2, getHeight() / 2);
	}

	private GPolygon createDiamond(double width, double height) {
		GPolygon diamond = new GPolygon();
		diamond.addVertex(-width / 2, 0);
		diamond.addVertex(0, -height / 2);
		diamond.addVertex(width / 2, 0);
		diamond.addVertex(0, height / 2);
		return diamond;
	}

}
