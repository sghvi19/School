import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class School extends ConsoleProgram {
	private HashMap<String, HashMap<String, ArrayList<String>>> teachers;

	public School() {
		teachers = new HashMap<String, HashMap<String, ArrayList<String>>>();
	}

	public void addTeacher(String teacher) {
		if (!teachers.containsKey(teacher)) {
			HashMap<String,ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
			teachers.put(teacher, map);
		}
	}

	public void addSubject(String teacher, String subject) {
		if(teachers.containsKey(teacher)) {
			HashMap<String,ArrayList<String>> mp=new HashMap<String,ArrayList<String>>();
			if(map.)
			
			
			
		}
	}

}