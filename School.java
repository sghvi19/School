import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class School {
	private Map<String, HashMap<String,ArrayList<String> > > data;
	
	
	public School() {
		 data = new  HashMap<String,ArrayList<String>>();
	}
	
	
	public void addTeacher(String teacher) {
		if(!data.containsKey(teacher)) data.put(teacher, new HashMap<String,ArrayList<String> >());
	}
	
	public void addSubject(String teacher, String subject) {
		data.get(teacher).put(subject,new ArrayList<String>());
	}
	
	public void addPupil(String pupil, String subject) {
		for(HashMap<String, ArrayList<String>> map : data.values() ) {
			if(map.containsKey(subject)) {
				map.get(subject).add(pupil);
			}
		}
		
	}
	
	public Iterator<String> getTeachers(String pupil) {
		List<String> teachers = new ArrayList<String>(); 
		
		for(String t: data.keySet()) {
			HashMap<String, ArrayList<String>> subPups = data.get(t); 
			for(ArrayList<String> pups: subPups.values()) {
				if(pups.contains(pupil) && !teachers.contains(t)) teachers.add(t);
			}
			
		}
		
		return teachers.iterator();
		
	}
	
	
	public Iterator<String> getPupils(String teacher) {
		ArrayList<String> pups = new ArrayList<String>(); 
		
		for(String sub: data.get(teacher).keySet()) {
			for(String pup: data.get(teacher).get(sub)) {
			
				if(!pups.contains(pup)) pups.add(pup);
			}
		}
		
		return pups.iterator();
			
	}
	
	
	public void removeTeacher(String teacher) {
		data.remove(teacher);
	}
	
	
	
	
	
	
}