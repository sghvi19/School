import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class main extends ConsoleProgram {

	public void run() {
		int n = readInt("enter ");
		int result = fibonachi(n);
		println(result);

	}

	private int fibonachi(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonachi(n-1)+fibonachi(n-2);
	}

}
