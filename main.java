import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class main extends GraphicsProgram {

	public void run() {

		double sqSize = (double) getHeight() / 8;

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {

				double x = j * sqSize;

				double y = i * sqSize;

				GRect sq = new GRect(x, y, sqSize, sqSize);

				sq.setFilled((i + j) % 2 != 0);

				add(sq);

			}
		}

	}
}
