
/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.*;

public class BlankClass extends ConsoleProgram {

	public void run() {
		int result = 0;
		String str = readLine("Enter text: ");
		String n = readLine("Enter letter: ");
		for (int i = 0; i < str.length(); i++) {
			if (n.charAt(0) == str.charAt(i)) {
				result++;
			}
		}
		println(result);
	}
}