import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class School extends ConsoleProgram {
	private ArrayList<String> teachers;
	public 
	School() {
		
	}
	
	public void addTeacher(String teacher) {
		teachers=new ArrayList<String>();
		teachers.add(teacher);
	}

}