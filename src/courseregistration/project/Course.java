package courseregistration.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
	
	public static final String[] COURSE_ID = {"CS101","CS102","CS103","CS104","CS105","CS106","CS107"};
	protected static String[] courseOffereings ={COURSE_ID[0],COURSE_ID[1],COURSE_ID[2],COURSE_ID[3],COURSE_ID[4],COURSE_ID[5]};
	
	static List<PreRequite> prerequiteList = new ArrayList<PreRequite>();
	static Map<String,PreRequite> map = new HashMap<String,PreRequite>();
	
	public class PreRequite { 
		String course1;
		String course2;
		String course3;
		String course4;
		
		    public PreRequite(String course1){
		    	this.course1 = course1;
		    	}		    
		}

	public Course() {
		
		addPrequisite(courseOffereings[0], new PreRequite("none"));
		addPrequisite(courseOffereings[1], new PreRequite(COURSE_ID[0]));
		addPrequisite(courseOffereings[2], new PreRequite(COURSE_ID[1]));
		addPrequisite(courseOffereings[3], new PreRequite(COURSE_ID[2]));
		addPrequisite(courseOffereings[4], new PreRequite(COURSE_ID[3]));
		addPrequisite(courseOffereings[5], new PreRequite(COURSE_ID[4]));
	}
	
	private void addPrequisite(String key,PreRequite item) {
		prerequiteList.add(item);
		map.put(key, item);
	}
	@SuppressWarnings("unused")
	private PreRequite getCoursePrequisites(String courseid) {
		return map.get(courseid);	 
	}
	
	
	 

}
