package courseregistration.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
    
   public static final String[] date = {"01-01-2015","03-01-2015","01-05-2015","01-07-2015","01-09-2015","01-11-2015"};
   public static final String time = "12:01 pm"; 
   public static final String[] room = {"A20","B12","C14","D22","C07","E01"};
    public static final double[] tuition = { 100.0,205.0,350.0,150.0,189.0,199.0};
    
    
    public static final String[] COURSE_ID = {"CS101","CS102","CS103","CS104","CS105","CS106","CS107"};
    protected static String[] courseOffereings ={COURSE_ID[0],COURSE_ID[1],COURSE_ID[2],COURSE_ID[3],COURSE_ID[4],COURSE_ID[5]};

    static List<PreRequite> prerequiteList = new ArrayList<PreRequite>();
    static Map<String,PreRequite> map = new HashMap<String,PreRequite>();
	
    static Map<String,String> dates = new HashMap<String,String>();
    static Map<String,String> times = new HashMap<String,String>();
    static Map<String,String> rooms = new HashMap<String,String>();
    static Map<String,Double> tuitions = new HashMap<String,Double>();
    
    public class PreRequite { 
	String preReq;
		
        public PreRequite(String preReq){
            this.preReq = preReq;
	}		    
    }

    public Course() {
	// hardCoded Data. this Better be implemented in a database
        
        addPrequisite(courseOffereings[0], new PreRequite("none"));
        addPrequisite(courseOffereings[1], new PreRequite(COURSE_ID[0]));
        addPrequisite(courseOffereings[2], new PreRequite(COURSE_ID[1]));
        addPrequisite(courseOffereings[3], new PreRequite(COURSE_ID[2]));
        addPrequisite(courseOffereings[4], new PreRequite(COURSE_ID[3]));
        addPrequisite(courseOffereings[5], new PreRequite(COURSE_ID[4]));
        
        //map courses to their dates
        dates.put(COURSE_ID[0],date[0]);
        dates.put(COURSE_ID[1],date[1]);
        dates.put(COURSE_ID[2],date[2]);
        dates.put(COURSE_ID[3],date[3]);
        dates.put(COURSE_ID[4],date[4]);
        dates.put(COURSE_ID[5],date[5]);
        // map courses to their times
        times.put(COURSE_ID[0],time);
        times.put(COURSE_ID[1],time);
        times.put(COURSE_ID[2],time);
        times.put(COURSE_ID[3],time);
        times.put(COURSE_ID[4],time);
        times.put(COURSE_ID[5],time);
        // map courses to their rooms
        rooms.put(COURSE_ID[0],room[0]);
        rooms.put(COURSE_ID[1],room[1]);
        rooms.put(COURSE_ID[2],room[2]);
        rooms.put(COURSE_ID[3],room[3]);
        rooms.put(COURSE_ID[4],room[4]);
        rooms.put(COURSE_ID[5],room[5]);
        // map courses to their rooms
        tuitions.put(COURSE_ID[0], tuition[0]);
        tuitions.put(COURSE_ID[1], tuition[1]);
        tuitions.put(COURSE_ID[2], tuition[2]);
        tuitions.put(COURSE_ID[3], tuition[3]);
        tuitions.put(COURSE_ID[4], tuition[4]);
        tuitions.put(COURSE_ID[5], tuition[5]);

    }
	
    private void addPrequisite(String key,PreRequite item) {
	prerequiteList.add(item);
	map.put(key, item);
    }
	
    protected String getCoursePrequisites(String courseid) {
	PreRequite pre = map.get(courseid);
        return pre.preReq;
    }
    protected String getCourseDate(String courseid){
         return dates.get(courseid);
    }
    protected String getCourseTime(String courseid){
         return times.get(courseid);
    }
    protected String getCourseRoom(String courseid){
         return rooms.get(courseid);
    }
    protected double getCourseTuition(String courseid){
        return tuitions.get(courseid);
    }
}
package courseregistration.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
    
   public static final String[] date = {"01-01-2015","03-01-2015","01-05-2015","01-07-2015","01-09-2015","01-11-2015"};
   public static final String time = "12:01 pm"; 
   public static final String[] room = {"A20","B12","C14","D22","C07","E01"};
    public static final double[] tuition = { 100.0,205.0,350.0,150.0,189.0,199.0};
    
    
    public static final String[] COURSE_ID = {"CS101","CS102","CS103","CS104","CS105","CS106","CS107"};
    protected static String[] courseOffereings ={COURSE_ID[0],COURSE_ID[1],COURSE_ID[2],COURSE_ID[3],COURSE_ID[4],COURSE_ID[5]};

    static List<PreRequite> prerequiteList = new ArrayList<PreRequite>();
    static Map<String,PreRequite> map = new HashMap<String,PreRequite>();
	
    static Map<String,String> dates = new HashMap<String,String>();
    static Map<String,String> times = new HashMap<String,String>();
    static Map<String,String> rooms = new HashMap<String,String>();
    static Map<String,Double> tuitions = new HashMap<String,Double>();
    
    public class PreRequite { 
	String preReq;
		
        public PreRequite(String preReq){
            this.preReq = preReq;
	}		    
    }

    public Course() {
	// hardCoded Data. this Better be implemented in a database
        
        addPrequisite(courseOffereings[0], new PreRequite("none"));
        addPrequisite(courseOffereings[1], new PreRequite(COURSE_ID[0]));
        addPrequisite(courseOffereings[2], new PreRequite(COURSE_ID[1]));
        addPrequisite(courseOffereings[3], new PreRequite(COURSE_ID[2]));
        addPrequisite(courseOffereings[4], new PreRequite(COURSE_ID[3]));
        addPrequisite(courseOffereings[5], new PreRequite(COURSE_ID[4]));
        
        //map courses to their dates
        dates.put(COURSE_ID[0],date[0]);
        dates.put(COURSE_ID[1],date[1]);
        dates.put(COURSE_ID[2],date[2]);
        dates.put(COURSE_ID[3],date[3]);
        dates.put(COURSE_ID[4],date[4]);
        dates.put(COURSE_ID[5],date[5]);
        // map courses to their times
        times.put(COURSE_ID[0],time);
        times.put(COURSE_ID[1],time);
        times.put(COURSE_ID[2],time);
        times.put(COURSE_ID[3],time);
        times.put(COURSE_ID[4],time);
        times.put(COURSE_ID[5],time);
        // map courses to their rooms
        rooms.put(COURSE_ID[0],room[0]);
        rooms.put(COURSE_ID[1],room[1]);
        rooms.put(COURSE_ID[2],room[2]);
        rooms.put(COURSE_ID[3],room[3]);
        rooms.put(COURSE_ID[4],room[4]);
        rooms.put(COURSE_ID[5],room[5]);
        // map courses to their rooms
        tuitions.put(COURSE_ID[0], tuition[0]);
        tuitions.put(COURSE_ID[1], tuition[1]);
        tuitions.put(COURSE_ID[2], tuition[2]);
        tuitions.put(COURSE_ID[3], tuition[3]);
        tuitions.put(COURSE_ID[4], tuition[4]);
        tuitions.put(COURSE_ID[5], tuition[5]);

    }
	
    private void addPrequisite(String key,PreRequite item) {
	prerequiteList.add(item);
	map.put(key, item);
    }
	
    protected String getCoursePrequisites(String courseid) {
	PreRequite pre = map.get(courseid);
        return pre.preReq;
    }
    protected String getCourseDate(String courseid){
         return dates.get(courseid);
    }
    protected String getCourseTime(String courseid){
         return times.get(courseid);
    }
    protected String getCourseRoom(String courseid){
         return rooms.get(courseid);
    }
    protected double getCourseTuition(String courseid){
        return tuitions.get(courseid);
    }
}
