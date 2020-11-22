
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
		// String rev = "ragaca";
		int result = 0;
		String str = readLine("Enter text: ");
		for (int i = 0; i < str.length(); i++) {
			if (i != 0) {
				if (str.substring(0, i).indexOf(str.charAt(i)) == -1) {
					for (int j = 0; j < str.length(); j++) {
						if(str.charAt(i)==str.charAt(j)) {
							result++;
						}
					}
					println(str.charAt(i)+" "+result);
					result=0;
				}
			}
		}
	}
}