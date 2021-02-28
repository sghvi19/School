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
		String str = readLine();
		String s="";
		for (int i = str.length()-1; i >= 0; i--) {
			s+=str.charAt(i);
		}
		if(s.equals(str)) {
			println("abara");
		}
	}

}
