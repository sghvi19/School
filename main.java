import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class main extends ConsoleProgram {

	public void run() {
		int x = 0;
		while (true) {
			x += 6;
			if (6 % x == 0 && 8 % x == 0) {
				println(x);
				break;
			}

		}
	}

}
