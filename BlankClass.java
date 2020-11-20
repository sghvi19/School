
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
		int temp = 0;
		Character lett = ' ';
		String str = readLine("Enter text: ");
		for (int i = 0; i < str.length()-1; i++) {
				for (int j = i ; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						temp++;
					}
				}
				if (result <= temp) {
					result = temp;
					lett=str.charAt(i);
				}

				temp = 0;
		}
		println(result+" "+lett);
		

	}
}