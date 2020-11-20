
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
		String rev= "";
		String str = readLine("Enter text: ");
		for (int i = str.length()-1; i >=0; i--) {
			rev+=str.charAt(i);
		}
		if(rev.equals(str)) {
			println("palindrome");
		}else {
			println("not palindrome");
		}
	}
}