import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;
import acm.util.ErrorException;

public class workout extends ConsoleProgram{


	public void run() {
		try {
			BufferedReader file = new BufferedReader(new FileReader("fx.java"));
			String line = file.readLine();
			while(true) {
			if(line==null)break;
			println(line);
			line=file.readLine();
			
			}
			file.close();
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}
		
	}
		
}
