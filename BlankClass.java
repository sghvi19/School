
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
		int x=0;
		int s;
		String str = readLine("enter number: ");
		for (int i = 0; i < str.length(); i++) {
			s=str.charAt(i)-'0';
			x*=10;
			x+=s;
		}
		println(x);
	}
}