package courseregistration.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// this class is a mess. it needs reconfig
public class RegistrationManager {
	public static String[] registrationStatus = {"Not Accepted", "Not Accepted"};// or Accepted 
	List<Pair> pairs = new ArrayList<Pair>();
	Map<String,Pair> map = new HashMap<String,Pair>();
	int listSize = pairs.size();
	String studentName;
	int 	   studentSSN ;
	String coursePicked;
	
	
	public RegistrationManager() {}
	
	public class Pair { 

	   int ssn;
	   String course;
	    
	    public Pair(int ssn, String course){ 

	        this.ssn = ssn;
	        this.course = course;
	    } 
	} 

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentSSN() {
		return studentSSN;
	}
	public void setStudentSSN(int studentSSN) {
		this.studentSSN = studentSSN;
	}
	public String getCoursePicked() {
		return coursePicked;
	}
	public void setCoursePicked(String coursePicked) {
		this.coursePicked = coursePicked;
	}
	
	public void addStudentToList(String studentName){
		
		pairs.add(new Pair(studentSSN, coursePicked));
		//map.put(studentName, pairs);	// ERRor
		
		System.out.println("student ssn  : " + pairs.get(pairs.size()-1).ssn);
		System.out.println("student course : " + pairs.get(pairs.size()-1).course);
	}
	
	public Pair getStudentFromList(String studentName){
		Pair student = (Pair) map.get(studentName);
		return student;	
	}
	
	public void deleteStudentFromList(String studentName){
		map.remove(studentName);
	}
	
	

	
}
