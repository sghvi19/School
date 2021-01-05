import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import acm.program.ConsoleProgram;

public class School extends ConsoleProgram {
	private HashMap<String, HashMap<String, ArrayList<String>>> teachers;

	public School() {
		teachers = new HashMap<String, HashMap<String, ArrayList<String>>>();
	}

	public void addTeacher(String teacher) {
		if (!teachers.containsKey(teacher)) {
			HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
			teachers.put(teacher, map);
		}
	}

	public void addSubject(String teacher, String subject) {
		if (teachers.containsKey(teacher)) {
			HashMap<String, ArrayList<String>> mp = teachers.get(teacher);
			ArrayList<String> list = new ArrayList<String>();
			mp.put(subject, list);

		}
	}

	public void addPupil(String pupil, String subject) {
		for (String teacher : teachers.keySet()) {
			if (teachers.get(teacher).containsKey(subject)) {
				teachers.get(teacher).get(subject).add(pupil);
			}

		}

	}

	public Iterator<String> getTeachers(String pupil) {
		ArrayList<String> list = new ArrayList<String>();
		for (String teacher : teachers.keySet()) {
			HashMap<String, ArrayList<String>> map = teachers.get(teacher);
			for (String subject : map.keySet()) {
				if (map.get(subject).contains(pupil)) {
					list.add(teacher);
					break;
				}
			}
		}

		if (!list.isEmpty()) {
			return null;
		}
		return list.iterator();
	}

	public Iterator<String> getPupils(String teacher) {
		ArrayList list = new ArrayList<String>();
		if (teachers.containsKey(teacher)) {
			for (String subject : teachers.get(teacher).keySet()) {
				for (String student : teachers.get(teacher).get(subject)) {
					list.add(student);
				}
			}
			return list.iterator();
		}
		return null;
	}
	public void removeTeacher(String teacher) {
		if(teachers.containsKey(teacher)) {
			teachers.remove(teacher);
		}
	}

}