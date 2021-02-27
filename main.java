import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class main extends GraphicsProgram {

	public void run() {
		int n = readInt("enter ");
		int result = fibonachi(n);
		println(result);

	}

	private int fibonachi(int n) {
		if (n == 2 || n == 2) {
			return 1;
		}
		return fibonachi(n-1)+fibonachi(n-2);
	}

}
