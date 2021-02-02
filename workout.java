import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class workout extends ConsoleProgram{


	public void run() {
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		
		list1.add("bla");
		list1.add("blu");
		
		
		list2.add("blu");
		list2.add("bla");
		
		if(list1.equals(list2)) {
			println("vasha");
		}
		
	}
		
}
